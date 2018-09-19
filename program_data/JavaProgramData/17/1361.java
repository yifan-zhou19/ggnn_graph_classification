package <missing>;

public class GlobalMembers
{
	///#include<math.h>


	public static int Main()
	{
		String st = new String(new char[101]);
		int[] g = new int[101];
		int len;
		int i;
		int j;
		int left;
		while (scanf("%s",st) != EOF)
		{
			System.out.printf("%s\n",st);
			len = st.length();
			left = 0;
			for (i = 0;i < len;i++)
			{
				if (st.charAt(i) == '(')
				{
					left++;
					g[left] = i;
				}
			}
			for (i = left;i > 0;i--)
			{
				for (j = g[i] + 1;j < len;j++)
				{
					if (st.charAt(j) == ')')
					{
						st = tangible.StringFunctions.changeCharacter(st, g[i], ' ');
						st = tangible.StringFunctions.changeCharacter(st, j, ' ');
						break;
					}
				}
			}
			for (i = 0;i < len;i++)
			{
				if (st.charAt(i) == ')')
				{
					System.out.print("?");
				}
				else if (st.charAt(i) == '(')
				{
					System.out.print("$");
				}
					 else
					 {
						 System.out.print(" ");
					 }
			}
			System.out.print("\n");
		}
		return 0;
	}


}

