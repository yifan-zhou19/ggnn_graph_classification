/*
2010 11 19 ??

??
???int a[4][3]???int b[3][5]??????????????????c=a*b. ????? 
c00 c01 c02 c03 c04 
c10 c11 c12 c13 c14 
c20 c21 c22 c23 c24 
c30 c31 c32 c33 c34 

?????????: 
????A[m][q]*B[q][n], 
????????C[m][n]?????C?????? 
C[i][j] = A[i][0]*B[0][j] + A[i][1]*B[1][j] + ..... + A[i][q]*B[q][j] 

?????????????4*3?3*5?????????????
????
????????????x1?y1?1<=x1<=100, 1<=y1<=100?? 
????x1?????y1???????????? 
???????????????x2?y2?1<=x2<=100?1<=y2<=100?????x2?y1???? 
????x2?????y2???????????? 
?????????int??????? 

??????? 
x1 y1 
a00 a01 a02 
a10 a11 a12 
a20 a21 a22 
a30 a31 a32 
x2 y2 
b00 b01 b02 b03 b04 
b10 b11 b12 b13 b14 
b20 b21 b22 b23 b24
????
?????x1???????????y2??????????c?????????? 

??????? 
c00 c01 c02 c03 c04 
c10 c11 c12 c13 c14 
c20 c21 c22 c23 c24 
c30 c31 c32 c33 c34

?? 1000012760

*/


int main(){

	int A[100][100], B[100][100], C[100][100];
	int i= 0, j= 0, k= 0, x1= 0, y1= 0, x2= 0, y2= 0;

	cin>>x1>>y1;

	for(i= 0; i< x1; i++)
		for(j= 0; j< y1; j++){
			cin>>A[i][j];
		}
	cin>>x2>>y2;

	for(i= 0; i< x2; i++)
		for(j= 0; j< y2; j++){
			cin>>B[i][j];
		}

	for(i= 0; i< x1; i++)
		for(j= 0; j< y2; j++){
			C[i][j]= 0;
			for(k= 0; k< y1; k++){
				C[i][j]= C[i][j]+ A[i][k]* B[k][j];
			}
		}

	for(i= 0; i< x1; i++){
		for(j= 0; j< y2- 1; j++){
			cout<<C[i][j]<<' ';
		}
		cout<<C[i][y2-1]<<endl;
	}


	return 0;
}