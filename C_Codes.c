/*********************
* 1. Read Line by Line from file
*
**********************/

#define _GNU_SOURCE
#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    FILE * fp;
    char * line = NULL;
    size_t len = 0;
    ssize_t read;

    fp = fopen("/etc/motd", "r");
    if (fp == NULL)
        exit(EXIT_FAILURE);

    while ((read = getline(&line, &len, fp)) != -1) {
        printf("Retrieved line of length %zu :\n", read);
        printf("%s", line);
    }

    fclose(fp);
    if (line)
        free(line);
    exit(EXIT_SUCCESS);
}


/*********************
* 2. get output from terminal Read Line by Line
*
**********************/

// get http linsk fro url and store to links array then update  links count
void getLinksFromUrl (char* url){
        
        //  prepare command
        char * command  =   (char *) malloc(150 + strlen(url) );
    
        // creating command : wget --quiet -O - http://stackoverflow.com | grep -o 'http://[^\"]*'
        strcpy(command, "wget --quiet -O - "); 
        strcat(command, url);
        strcat(command, " | grep -o 'http://[^\"]*'");


        //printf("Enterd command %s\n" , command);
        FILE *fp;
        char path[1035] ; 
        /* Open the command for reading. */
        fp = popen(command, "r");
        if (fp == NULL) {
          printf("Failed to run command\n" );
          exit(1);
        }

        linkCount ; 
        /* Read the output a line at a time - output it. */
        while (fgets(path, sizeof(path)-1, fp) != NULL) {
          //printf("Printig : %s", path);
        linkCount++;
        strcpy(&links[linkCount*link_size], path);
        

        }

        /* close */
        pclose(fp);
        
        }

/*********************
*  3.
*
**********************/

