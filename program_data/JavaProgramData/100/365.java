package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String a = new String(new char[300]);
	char[][] alph = new char[26][300];
	int i;
	int n;
	int j;
	int times;
	int flag = 0;
	char b;


	a = new Scanner(System.in).nextLine();
	n = a.length();



		for (i = 0;i < 26;i++)
		{
			for (j = 0;j < 300;j++)
			{
				alph[i][j] = 0;
			}
		}


		for (i = 0;i < n;i++)
		{

			  if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			  {
				  times = 0;
				 flag++;
				 for (j = 0;j < n;j++)
				 {
					if (a.charAt(i) == a.charAt(j) && times == 0)
					{
						times++;
						b = a.charAt(i);
					}
				else if (a.charAt(i) == a.charAt(j) && times >= 1)
				{
					times++;
					a = tangible.StringFunctions.changeCharacter(a, j, ' ');
				}
				 }
				alph[b - 97][times] = b;
			  }

		}
		if (flag > 0)
		{
		for (i = 0;i < 26;i++)
		{
			for (j = 0;j < 300;j++)
			{
				if (alph[i][j] >= 'a' && alph[i][j] <= 'z')
				{
					System.out.printf("%c=%d\n",alph[i][j],j);
				}
			}
		}
		}
	if (flag == 0)
	{
		System.out.print("No\n");
	}
	}


}

