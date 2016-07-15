package com.sankuai.srq.deploy

class InstanceConfig {
    static ProjectMeta srqserver = new ProjectMeta(
            projectName: "srqserver",
            gitRepoUri: "ssh://git@git.sankuai.com/srt/srqserver.git",
            gitbranchName: "dev",

            portList: [
                    ["port": 8088, "description": "http jetty port"] as PortMeta
            ],
            needJavaDebugPort: true,
            logFolder: "/opt/logs/srq/",
            needMountNodeLib: false,
            needMountGradleLib: true,

            deployScriptFile: "srq_deploy.sh",
    )
    static ProjectMeta h5 = new ProjectMeta(
            projectName: "H5",
            gitRepoUri: "ssh://git@git.sankuai.com/fe/fe-paidui.git",
            gitbranchName: "test",

            portList: [
                    ["port": 8080, "description": "node server port"] as PortMeta
            ],
            needJavaDebugPort: false,
            logFolder: "/var/sankuai/logs/paidui/",
            needMountNodeLib: true,
            needMountGradleLib: false,

            deployScriptFile: "h5_deploy.sh",
    )

    static ProjectMeta jxc=new ProjectMeta(
            projectName: "JXC",
            gitRepoUri: "ssh://git@git.sankuai.com/srt/jxc.git",
            gitbranchName: "dev",

            portList: [
                    ["port": 8088, "description": "jxc server port"] as PortMeta
            ],
            needJavaDebugPort: false,
            logFolder: "/opt/logs/srq/",
            needMountNodeLib: false,
            needMountGradleLib: true,

            deployScriptFile: "jxc_deploy.sh",
    )

    static ProjectMeta fastFood=new ProjectMeta(
            projectName: "Fast-Food",
            gitRepoUri: "ssh://git@git.sankuai.com/srt/srcms.git",
            gitbranchName: "dev",

            portList: [
                    ["port": 8088, "description": "jxc server port"] as PortMeta,
                    ["port": 9103, "description":"thrift port"] as PortMeta,
                    //["port": 9103, "description":"thrift port", hostPort:9103] as PortMeta
            ],
            needJavaDebugPort: false,
            logFolder: "/opt/logs/sr/cms",
            needMountNodeLib: false,
            needMountGradleLib: true,

            deployScriptFile: "srcms_deploy.sh",
    )
	static ProjectMeta srcos=new ProjectMeta(
		projectName: "srcos",                                         //项目名称
		gitRepoUri: "ssh://git@git.sankuai.com/srt/srcosserver.git",        //项目git repo url
		gitbranchName: "dev",                                         //默认branch名称，在部署时还会提示用户输入
		portList: [//所需要的端口列表
			[
				"port": 8088,                         //端口号
				"description": "http jetty port"    //端口描述
			] as PortMeta
		],
		needJavaDebugPort: true,            //是否需要打开远程调试端口
		logFolder: "/opt/logs/srcos/",      //输入日志的文件夹
		needMountNodeLib: false,            //是否需要加载node.js库（非node工程都填false）
		needMountGradleLib: true,           //是否需要加载gradle库（gradle工程都填true）
		
		deployScriptFile: "srcos_deploy.sh",
	)
    
    static ProjectMeta srsupplychain=new ProjectMeta(
        projectName: "srsupplychain",                                         //项目名称
		gitRepoUri: "ssh://git@git.sankuai.com/srt/srscm.git",        //项目git repo url
		gitbranchName: "dev",                                         //默认branch名称，在部署时还会提示用户输入

		portList: [//所需要的端口列表
			[
				"port": 8088,                         //端口号
				"description": "http jetty port"    //端口描述
    		] as PortMeta
		],
		needJavaDebugPort: true,            //是否需要打开远程调试端口
		logFolder: "/opt/logs/srsupplychain/",      //输入日志的文件夹
		needMountNodeLib: false,            //是否需要加载node.js库（非node工程都填false）
		needMountGradleLib: true,           //是否需要加载gradle库（gradle工程都填true）
        
        deployScriptFile: "srsupplychain_deploy.sh",
    )
	
	static ProjectMeta fe_paidui_crm=new ProjectMeta(
		projectName: "fe-paidui-crm",                                         //项目名称
		gitRepoUri: "ssh://git@git.sankuai.com/fe/fe-paidui-crm.git",        //项目git repo url
		gitbranchName: "master",                                         //默认branch名称，在部署时还会提示用户输入
		portList: [//所需要的端口列表
		   [
			   "port": 8080,                         //端口号。docker内部jetty http端口目前固定为8088，暂时不要指定为其他数值
			   "description": "http node port"    //端口描述
		   ] as PortMeta
		],
		needJavaDebugPort: false,            //是否需要打开远程调试端口
		logFolder: "/var/sankuai/logs/fe-paidui-crm/",      //输入日志的文件夹
		needMountNodeLib: true,            //是否需要加载node.js库（非node工程都填false）
		needMountGradleLib: false,           //是否需要加载gradle库（gradle工程都填true）
		
		deployScriptFile: "fe-paidui-crm_deploy.sh",
	)
	
	static ProjectMeta srtable=new ProjectMeta(
		projectName: "srtable",                                         //项目名称
		gitRepoUri: "ssh://git@git.sankuai.com/srt/srtablemanagement.git",        //项目git repo url
		gitbranchName: "dev",                                         //默认branch名称，在部署时还会提示用户输入
		
		portList: [//所需要的端口列表
			[
				"port": 8088,                         //端口号
				"description": "http jetty port"    //端口描述
			] as PortMeta
		],
		needJavaDebugPort: true,            //是否需要打开远程调试端口
		logFolder: "/opt/logs/srtable/",      //输入日志的文件夹
		needMountNodeLib: false,            //是否需要加载node.js库（非node工程都填false）
		needMountGradleLib: true,           //是否需要加载gradle库（gradle工程都填true）
		deployScriptFile: "srtable_deploy.sh",
	)
	
    def static projectsConfig = [
            'srqserver'   : [srqserver],
            'h5':[h5],
            'jxc':[jxc],
            'srcms':[fastFood],
            'srqserver_h5': [srqserver, h5],
			'srcos':[srcos],
            'srsupplychain':[srsupplychain],
			'fe-paidui-crm_crm':[fe_paidui_crm,crm],
			'fe-paidui-crm':[fe_paidui_crm],
			'srtable':[srtable],
            'srcms_h5':[fastFood, h5],
    ]
}
