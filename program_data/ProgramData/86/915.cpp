//
//	????:	????
//	????:	??????????????
//	????:	?  ? ( ? ?: 1000012733 ) 
//	????:	2010 ? 11 ? 27 ?
//
int main()
{
	int n, i, j, amount;								//?????????????:??n??????????,amount????????????????????,i?j?????
	int times[20][10];									//??????times??????????????????????
	int m[20];											//????????m??????????????
	cin >> n;											//???????????????n
	for ( i = 0; i < n; i ++ )
	{
		cin >> m[i];									//?????????i+1??????????
		for ( j = 0; j < m[i]; j ++ )
		{
			cin >> times[i][j];							//???????????????????????????
		}
	}
	for ( i = 0; i < n; i ++ )
	{
		if ( m[i] == 0 )
			cout << "60" << endl;						//????????????,??????60
		else
		{
			for ( j = m[i] - 1; j >= 0; j -- )
			{
				if (( times[i][j] + 3 * j >= 57 ) && ( times[i][j] + 3 * j <= 60 ))
				{
					cout << times[i][j] << endl;
					break;
				}										/*????j+1??????????,??????,????????????????57?(?????????????),
														??????????.*/
				else if ( times[i][j] + 3 * j < 57 )
				{
					amount = 60 - 3 * ( j + 1 );
					cout << amount << endl;
					break;
				}										/*???????????????57?,????????????????,?????????????????????
														??????????*/
			}
		}
	}
	return 0;
}