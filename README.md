在本项目中备注一下github上传项目文件的步骤以及常见问题。
第一步：访问我的github个人仓库，新建repositories，可备注仓库的类型public/private，可选择是否添加README文件，并添加对本项目的描述。
第二步：根据系统类型（windows/linux）下载git。以windows11版本为例，下载的版本应该是64-bit Git for Windows Setup
第三步：右键待上传的项目，选择git bash here，此时会出现终端输入框。
第四步：输入git init初始化，此时项目中会建立.git文件夹
第五步：输入git add *添加所有文件
第六步：点击.git文件夹，找到config文件，右键在文本编辑器中打开（选择记事本或者vscode均可），编辑信息：
       [user]
       email = github注册使用的邮箱
       name = github的用户名
       编辑结束之后保存，关掉文本编辑器
第七步：gitbash终端输入 git commit -m "first commit"
第八步：输入git remote add origin 复制过来你的github仓库链接（在仓库内“code”下进行复制即可，要注意粘贴应该右键paste，而不能ctrl cv这里会出现错误）
第九步：输入git push -u origin master等待上传至仓库 注意:如果项目文件中有密钥等信息，需要把密钥改为“MyAccessKey”之类的名称，否则会被扫描为不安全，无法上传
第十步：刷新个人仓库，在main目录下，应该已经有master分支，点开就能够看到已经成功上传的所有项目文件。至此，上传成功。
