/*
 * 2012_middle_term_5.cpp
 *??
??????????????????????n*n?????????????????????????????????
???????????????????????????????????????????????????????m????????
????
???????n?n???100????n*n??????
????n????n????�.�???????????????�#�????????�@�????????????????
???????????m?m???100.
????
???m????????
????
5
....#
.#.@.
.#@..
.....
4
????
16
 *  Created on: 2013?10?31?
 *      Author: KyLin
 */
int main ()
{
	int n;
	cin>>n;
	char a[n][n];       //????a????????? ???????? ????????
	int t1,t2,t3;                  //?????t1,t2,t3
	for (t1=0;t1<n;++t1)
		for (t2=0;t2<n;++t2)
			cin>>a[t1][t2];
	int m;
	cin>>m;
	for (t1=1;t1<m;++t1)              //?????m?????
	{
		for (t2=0;t2<n;++t2)
			for (t3=0;t3<n;++t3)
			{
				if (a[t2][t3]=='@')      //??????@??
				{
					if (t2!=0&&t2!=n-1)   //?????????n????????????
					{
						if (a[t2-1][t3]=='.')
							a[t2-1][t3]='T';     //?T????????????????????
						if (a[t2+1][t3]=='.')
							a[t2+1][t3]='T';
					}
					if (t2==0)     //??????
						if (a[1][t3]=='.')
							a[1][t3]='T';
					if (t2==n-1)     //?n????
						if (a[n-2][t3]=='.')
						    a[n-2][t3]='T';

					if (t3!=0&&t3!=n-1)   //?????????n????????????
					{
						if (a[t2][t3-1]=='.')
							a[t2][t3-1]='T';     //?T????????????????????
						if (a[t2][t3+1]=='.')
							a[t2][t3+1]='T';
					}
					if (t3==0)     //??????
						if (a[t2][1]=='.')
							a[t2][1]='T';
					if (t3==n-1)     //?n????
						if (a[t2][n-2]=='.')
						    a[t2][n-2]='T';
				}
			}
		for (t2=0;t2<n;++t2)
			for (t3=0;t3<n;++t3)
				if (a[t2][t3]=='T')
					a[t2][t3]='@';            //???? ???T??@ ??????
	}
	int total=0;           //total?????????
	for (t2=0;t2<n;++t2)
		for (t3=0;t3<n;++t3)
			if (a[t2][t3]=='@')
				++total;
	cout<<total;
	return 0;
}


