#include <stdio.h>
#include <stdlib.h>


// Hash manipulation functions in hash_functions.c
void hash(char *hash_val, long block_size);
void check_hash(const char *hash1, const char *hash2, long block_size);


#ifndef MAX_BLOCK_SIZE
    #define MAX_BLOCK_SIZE 1024
#endif


int main(int argc, char **argv) {
    char hash_val[MAX_BLOCK_SIZE];
	if(argc > 3){
		printf("Usage:compute_hash BLOCK_SIZE [ COMPARISON_HASH ] \n");
		return 0;
	}
	int first_arg = strtol(argv[1],NULL, 10);
	if(first_arg > MAX_BLOCK_SIZE || first_arg <= 0){
		printf("The block size should be a positive integer less than MAX_BLOCK_SIZE. \n");
		return 0;
	}
	hash(hash_val,first_arg);
	if(argc == 3){
		check_hash(argv[2], hash_val, first_arg);
	}
    //printf("Received %d command line arguments.\n", argc);
    //for (int i = 0; i < argc; i++) {
    //    printf("arg %d: %s\n", i, argv[i]);
    //}
	//printf("Hash Value %s. \n",hash_val);
    return 0;
}

