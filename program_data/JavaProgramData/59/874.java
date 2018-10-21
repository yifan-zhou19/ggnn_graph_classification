/* Name      : ???? 
 * Version   : 2.0
 * Date      : 2012-11-24
 * New       : ???????? 
 * Func&Feat : 
 * State     : Work
 */
char[][] room =
{
	{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
}; //????????room[][]????????
void infection(int,int);
int main()
{
	int n; //???infector???????
	int m;
	int infector = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < n;i++)
	{
		room[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
	}
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	infection(m,n);
	for (int i = 0;i < n;i++)
	{
		for (int j = 0;j < n;j++)
		{
			if (room[i][j] == '@')
			{
				infector++; //?????'@'???
			}
		}
	}
	System.out.print(infector);
	return 0;
}
void infection(int day,int n)
{
	if (day > 2)
	{
		infection(day - 1,n);
	}
	for (int i = 0;i < n;i++)
	{
		for (int j = 0;j < n;j++)
		{
			if (room[i][j] == '.')
			{
				if (room[i][j - 1] == '@' || room[i][j + 1] == '@' || room[i - 1][j] == '@' || room[i + 1][j] == '@')
				{
					room[i][j] = '$';
				}
			}
		}
	}
												 //???????????????????'$'?? 
	for (int i = 0;i < n;i++)
	{
		for (int j = 0;j < n;j++)
		{
			if (room[i][j] == '$')
			{
				room[i][j] = '@'; //????????'@'???????????
			}
		}
	}
/*    cout<<"?"<<day<<"??"<<endl;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)cout<<room[i][j];
        cout<<endl;
    }//*/
}


