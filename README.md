# GitHub 项目上传步骤及常见问题

## 上传步骤

### 第一步：创建仓库
1. 访问 GitHub 个人仓库，新建 Repositories。
2. 备注仓库类型（Public/Private）。
3. 可选择是否添加 README 文件。
4. 添加对本项目的描述。

### 第二步：下载 Git
1. 根据系统类型（Windows/Linux）下载 Git。
2. 以 Windows 11 为例，下载 64-bit Git for Windows Setup。

### 第三步：打开 Git Bash
1. 右键待上传的项目。
2. 选择 "Git Bash Here"。
3. 出现终端输入框。

### 第四步：初始化
1. 输入 `git init`。
2. 项目中建立 `.git` 文件夹。

### 第五步：添加文件
1. 输入 `git add *` 添加所有文件。

### 第六步：配置信息
1. 点击 `.git` 文件夹，找到 `config` 文件。
2. 右键在文本编辑器中打开（记事本或 VS Code）。
3. 编辑信息：email=github注册邮箱，name=github用户名
4. 保存并关闭。

### 第七步：提交
1. 输入 `git commit -m "first commit"`。

### 第八步：关联远程仓库
1. 输入 `git remote add origin` + 复制的 GitHub 仓库链接。
*注意：在仓库内 "Code" 下复制，粘贴时右键 Paste，不要 Ctrl+C/V。*

### 第九步：推送
1. 输入 `git push -u origin master` 等待上传。
*注意：如果项目文件中有密钥等信息，需改为 "MyAccessKey" 等名称，否则会被扫描为不安全，无法上传。*

### 第十步：验证
1. 刷新个人仓库。
2. 在 main 目录下查看 master 分支。
3. 点开查看已上传的项目文件，上传成功。
