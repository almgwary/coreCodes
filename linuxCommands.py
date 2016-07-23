'Linux'
	
	sudo chmod -R 777
'indicator'
sudo add-apt-repository ppa:indicator-multiload/stable-daily
sudo apt-get update
sudo apt-get install indicator-multiload





#############################################################
'Prallel MPI'
 

	$mpicc mpi_hello.c -o hello
	$mpirun -np 2 ./hello
	/media/almgwary/amrPrivatS/fci/codes/


#################################################
'Git '

# clone repo
git clone https://github.com/almgwary/parallel-MPI-Dos-and-Mirror.git
# go to dir
cd parallel-MPI-Dos-and-Mirror/
# init
git init
# add all files
git add .
# commt
git commit -m "v.1"

# Sets the new remote
git remote add origin remote repository URL
# Verifies the new remote URL
git remote -v
# uploud  file
git push origin master



# see updated file only
git diff --name-status
# add updated file only 
git add -u
#clone all my repos 
 curl "https://api.github.com/users/almgwary/repos?per_page=1000" | grep -o 'git@[^"]*' | xargs -L1 git clone
#gh pages
-- start 
git branch gh-pages
git push origin gh-pages
 
git checkout gh-pages
 
git push


#################################################
### bootstrap-cli 
#Command-line interface for Bootstrap.
# Installing
npm install -g bootstrap-cli
# Updating
npm update -g bootstrap-cli
bootstrap -v
# New
bootstrap new
# Create and use your own templates:
bootstrap new --repo https://github.com/username/template-name.git
# Watch
cd appName
bootstrap watch
http://localhost:8080
# Build
bootstrap build
# Update
Bootstrap update
# Help
bootstrap help
# Add a command name at the end to learn how a specific command works.
bootstrap help new
####
#############################################################

	