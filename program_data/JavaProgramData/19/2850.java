package <missing>;

public class GlobalMembers
{
	public static String res = new String(new char[nMax]);
	public static char[][] map = new char[nMax][nMax];
	public static String src = new String(new char[nMax]);
	public static String dst = new String(new char[nMax]);


	public static int Main()
	{

		res = new Scanner(System.in).nextLine();
		//res[strlen(res)-1]='\0';
		int i;
		int j;
		int k;
		for (i = 0,j = 0,k = 0;i < res.length();i++)
		{
			if (res.charAt(i) == ' ')
			{
				j = 0;
				k++;
			}
			else
			{
				map[k][j] = res.charAt(i);
				j++;
			}
		}
		map[k][j] = '\0';
		//for(i=0;i<=k;i++)printf("%s ",map[i]);
		//gets(src);
		//gets(dst);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			src = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			dst = tempVar2.charAt(0);
		}
		for (i = 0;i <= k;i++)
		{
			if (strcmp(map[i],src) == 0)
			{
				System.out.printf("%s",dst);
			}
			else
			{
				System.out.printf("%s",map[i]);
			}
			if (i != k)
			{
				System.out.print(" ");
			}
		}


		System.out.print("\n");
		   return 0;
	}

}

