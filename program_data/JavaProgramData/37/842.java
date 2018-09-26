package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int[][] time = new int[26][2];
		int min = 0;
		char x = ' ';
		String str = new String(new char[100000]);
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < 26;i++)
		{
			time[i][0] = -1;
			time[i][1] = 0;
		} //time[i][0]??????,time[i][1]????
		for (i = 0;i < t;i++)
		{
			for (j = 0;;j++)
			{
				x = System.in.read();
				//cout<<"x="<<x<<endl;//explain
				if (x == '\n')
				{
					min = 999999;
					for (k = 0;k < 26;k++)
					{
						if (time[k][1] == 1 && time[k][0] < min)
						{
							min = time[k][0];
						}
					}
					if (min == 999999)
					{
						System.out.print("no");
						System.out.print("\n");
					}
					else
					{
						System.out.print(str.charAt(min));
						System.out.print("\n");
					}
					break;
				}
				else
				{
					str = tangible.StringFunctions.changeCharacter(str, j, x);
					if (time[x - 97][1] == 0)
					{
						time[x - 97][0] = j;
						time[x - 97][1]++;
					}
					else
					{
						time[x - 97][1]++;
					}
				}
			}
			for (k = 0;k < 26;k++)
			{
				//cout<<"time["<<k<<"][1]="<<time[k][1]<<endl;//???????
				time[k][0] = -1;
				time[k][1] = 0;
			}
			//cout<<"i="<<i<<endl;//explain
		}
		return 0;
	}
}

