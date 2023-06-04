package cc.sgee.WeChatChum

import android.widget.Toast
import com.highcapable.yukihookapi.annotation.xposed.InjectYukiHookWithXposed
import com.highcapable.yukihookapi.hook.factory.configs
import com.highcapable.yukihookapi.hook.factory.encase
import com.highcapable.yukihookapi.hook.xposed.proxy.IYukiHookXposedInit

@InjectYukiHookWithXposed
class MainHook : IYukiHookXposedInit{


    override fun onInit() = configs {
        isDebug = false
    }

    override fun onHook() = encase {
        TODO("Not yet implemented")
        loadApp("com.tencent.mm") {
            findClass("").hook {
                injectMember {
                    method {

                    }
                    afterHook {

                    }
                }
            }
        }
        Toast.makeText(systemContext,"这是一个测试的Toast",Toast.LENGTH_SHORT).show();
    }
}