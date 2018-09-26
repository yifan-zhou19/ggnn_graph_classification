package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char s1;
		char s2;
		String a = new String(new char[100]);
		char p;
		int i;
		int j;
		int k;
		int n;
		int flag;
		int tj;
		int ttj;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}

		for (i = 0;;i++)
		{



			for (k = i;;k++)
			{
				if (a.charAt(k) == '\0')
				{
				break;
				}
				if (a.charAt(k) != '0')
				{
				flag = 1;
				}
			}
			if (flag == 0)
			{
			break;
			}
			flag = 0;



			for (j = i;;j++)
			{
				if (a.charAt(j) != '0')
				{
						s1 = a.charAt(j);
					tj = j;

				  /*  printf("%c",s);  */
					break;
				}
			}


			for (j++;;j++)
			{
				if (a.charAt(j) != '0')
				{
						s2 = a.charAt(j);
					ttj = j;
				  /*  printf("%c",s);  */
					break;
				}
			}







			if (s1 != s2)
			{
				System.out.printf("%d %d\n",tj,ttj);

				a = tangible.StringFunctions.changeCharacter(a, tj, '0');
				a = tangible.StringFunctions.changeCharacter(a, ttj, '0');
				i = -1;
			}

			/*printf("%s\n",a);     */
		}


		return 0;
	}

}

