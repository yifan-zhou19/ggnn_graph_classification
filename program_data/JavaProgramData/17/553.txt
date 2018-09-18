package <missing>;

public class GlobalMembers
{
	public static int[] d = new int[120];
	public static int l = 0;
	public static int search(int p)
	{
		int i = p + 1;
		int j = 0;
		while (true)
		{
			if (d[i] == -1)
			{
				j = search(i); //??
				i = j + 1;
			}
			else
			{
				if (d[i] == 1)
				{
					d[p] = 0;
					d[i] = 0;
					return i;
				}
				else
				{
					i++;
				}
			}
			if (i >= l)
			{
				return i;
			}
		}
	}
	public static int Main()
	{
		char ch;
		int i;
		int j;
		while (cin.get(ch))
		{
		//	cout<<"-----"<<ch<<endl;
			if (ch == '\n')
			{
				System.out.print("\n");
				i = 0;
				while (i < l)
				{
					while (i < l && d[i]>-1)
					{
						i++;
					}
					if (i >= l)
					{
						break;
					}
				   j = search(i);
				   i = j + 1;
				}
				for (i = 0;i < l;i++)
				{
					if (d[i] == -1)
					{
						System.out.print('$');
					}
					else if (d[i] == 1)
					{
						System.out.print('?');
					}
					else
					{
						System.out.print(' ');
					}
				}
				System.out.print("\n");
				l = 0;
				for (i = 0;i < 100;i++)
				{
					d[i] = 0;
				}
			}
			else
			{
				System.out.print(ch);
				if (ch == '(')
				{
					d[l] = -1;
				}
				if (ch == ')')
				{
					d[l] = 1;
				}
				l++;
			}
			ch = '\0';
		}
		return 0;
	}

}
