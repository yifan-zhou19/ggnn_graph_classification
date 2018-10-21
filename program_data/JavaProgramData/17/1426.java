package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h;
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int len;
		int left = 0;
		int t = 0;
		int[] c = new int[101];
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int[] c = new int[101];
			left = 0;
			t = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			len = a.length();
			//for(j=0;j<len;j++)
			//	b[j]=' ';
			//b[len]='\0';
			for (j = 0;j < len;j++)
			{
				if (a.charAt(j) != '(' && a.charAt(j) != ')')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, ' ');
				}
				if (a.charAt(j) == '(')
				{
					left++;
					b = tangible.StringFunctions.changeCharacter(b, j, '$');
					c[t] = j;
					t++;
				}
				if (a.charAt(j) == ')')
				{
					if (left == 0)
					{
						b = tangible.StringFunctions.changeCharacter(b, j, '?');
					}
					else
					{
						t--;
						b = tangible.StringFunctions.changeCharacter(b, c[t], ' ');
						b = tangible.StringFunctions.changeCharacter(b, j, ' ');
						left--;
					}
				}

			}
			System.out.printf("%s\n",a);
			for (h = 0;h < len;h++)
			{
				System.out.printf("%c",b.charAt(h));
			}
			System.out.print("\n");
		}
		return 0;
	}




}

