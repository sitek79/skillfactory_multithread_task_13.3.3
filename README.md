"# skillfactory_multithread_task_13.3.3"
Простой чат-сервер.
Минимальная функциональность успешно выполненного задания: к серверу может присоединиться несколько клиентов одновременно.
Всё, что пишется на любом из клиентов, передается в окна других клиентов после нажатия на Enter.
При отсоединении любого клиента программа должна продолжать работать корректно.
Уже присоединенные клиенты продолжают общаться между собой, и к ним могут присоединиться новые.
Настройка кодировки консоли в Windows:
1251 - Windows-кодировка (Кириллица);
866 - DOS-кодировка;
65001 - Кодировка UTF-8;
Посмотрим текущую кодировку
chcp
Т.е. для смены кодировки на DOS, команда примет следующий вид:
chcp 866
Для смены кодировки на UTF-8, команда примет следующий вид:
chcp 65001
Для смены кодировки на Windows-1251, команда примет следующий вид:
chcp 1251

Quick setup — if you’ve done this kind of thing before
or
https://github.com/sitek79/skillfactory_multithread_task_13.3.3.git
Get started by creating a new file or uploading an existing file. We recommend every repository include a README, LICENSE, and .gitignore.

…or create a new repository on the command line
echo "# skillfactory_multithread_task_13.3.3" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/sitek79/skillfactory_multithread_task_13.3.3.git
git push -u origin main
…or push an existing repository from the command line
git remote add origin https://github.com/sitek79/skillfactory_multithread_task_13.3.3.git
git branch -M main
git push -u origin main
…or import code from another repository
You can initialize this repository with code from a Subversion, Mercurial, or TFS project.
