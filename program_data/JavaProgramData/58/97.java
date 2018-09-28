package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		int n; //??????
		int i;
		int[] p = new int[200];
		int j;
		int m;
		String str = new String(new char[100]); //??????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 200;i++)
		{
			p[i] = 1; //?????????????1
		}
		for (i = 0;i < n;i++)
		{
			System.in.read();
			cin.get(str,200); //?????
			m = str.length();
			if (((str.charAt(0) <= 'z') && (str.charAt(0) >= 'a')) || ((str.charAt(0) >= 'A') && (str.charAt(0) <= 'Z')) || (str.charAt(0) == '_'))
			{ //????
				for (j = 1;j < m;j++)
				{
					if (((str.charAt(j) < 'a') || (str.charAt(j)>'z')) && ((str.charAt(j) < 'A') || (str.charAt(j)>'Z')) && ((str.charAt(j) < '0') || (str.charAt(j)>'9')) && (str.charAt(j) != '_'))
					{ //?????
						p[i] = 0;
						break;
					}
				}
			}
			else
			{
				p[i] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.print(p[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

