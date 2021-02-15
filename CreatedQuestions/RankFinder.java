/**
 ** Find the Rank **
 
Question statement : Mr. Bin is a recruiter in big company. he got the information of some open position in their company from recruitment head.so, he conducted the Assessment for fill the open position with cutoff marks M. there are N candidate participated in Assessment. he wanted to know the rank of student whose marks is M. so, he can prepared the rank list of candidate upto cutoff marks (M). can you help him to find the rank of candiate whose marks is M.

 Rule to find rank:
	**if candidate have same marks then their rank will be same.
	**if candidate have 0 marks then their rank  won't be same.

 constraints :
 1<=N<=10^8
 1<=M<=100


 Input :
	line 1 : number of candiate N 
 	line 2 : marks of N candidate separated by space 
 	line 3 : cutoff marks M

Output :
	if candidate found with cutoff marks M  then print the rank else print -1

 sample input 1: 
	 5
	 5 3 5 2 1
 	 3

 Output : 
	3

 Explanation:
 	5 3 5 2 1
	1 3 1 4 5
 
*/
