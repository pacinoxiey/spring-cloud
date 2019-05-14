
主要命名格式

/{application}/{profile}[/{label}] 
 
/{application}-{profile}.yml 
 
/{label}/{application}-{profile}.yml 
 
/{application}-{profile}.properties 
 
/{label}/{application}-{profile}.properties
 
#label:表示git仓库的分支
#application：表示具体服务单元的名称，即后面config-client的application-name
#profile: 指定环境类型
dev-开发环境
prod-生产环境
test-测试环境