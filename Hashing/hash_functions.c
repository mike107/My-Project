#include <stdio.h>
#include <stdlib.h>
/*
 * Compute an xor-based hash of the data provided on STDIN. The result
 * should be placed in the array of length block_size pointed to by
 * hash_val.
 */
void hash(char *hash_val, long block_size) {
	char user_input;
	for(int i=0; i< block_size;i++){
		*(hash_val + i) = '\0';
	}
	int i=0;
	printf("\nUser input: \n");
	while(scanf("%c", &user_input)!=EOF){
		if(i == block_size ){
			i=0;
		}
		*(hash_val +i)= *(hash_val + i) ^ user_input;
		i++;
	}
	printf("\n");
	for(int i=0; i< block_size;i++){
		printf(" %d ",*(hash_val + i));
	}
	printf("\n");
	return;
}


/* 
 * Print the message "Hashes match" if the two hashes of size 
 * block_size contain the same value. Print "Hash mismatch" otherwise.
 */
void check_hash(const char *hash1, const char *hash2, long block_size) {
	int match = 0;
	for(int i=0; i<block_size;i++){
		if(*(hash1 +i) == *(hash2+i)){
			match = match + 0;
		}
		else{
			match = match + 1;
		}
	}
	if(match == 0){
		printf("\nHashes match\n");
	}
	else {
		printf("\nHashes mismatch\n");
	}
}
