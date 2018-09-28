package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		char[][] a = new char[10000][81];
		int[] b = new int[10000];
		p2 = b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						p1 = (a[i]);
						p1 = new Scanner(System.in).nextLine();
						(*(p2 + i)) = 1;
						for (j = 0;(*(p1.Substring(j))) != '\0';j++)
						{

													if (((*(p1.Substring(j))) != '_') && ((!((*(p1.Substring(j))) > 47) && ((*(p1.Substring(j))) < 58))) && ((!((*(p1.Substring(j)))>64) && ((*(p1.Substring(j))) < 91))) && ((!((*(p1.Substring(j)))>96) && ((*(p1.Substring(j))) < 123))))
													{
																																														(*(p2 + i)) = 0;
																																														break;
													}
													if ((j == 0) && ((!((*(p1.Substring(j))) > 64) && ((*(p1.Substring(j))) < 91)) && ((!((*(p1.Substring(j)))>96)) && ((*(p1.Substring(j))) < 123)) && (*(p1.Substring(j))) != '_'))
													{
																																							(*(p2 + i)) = 0;
																																														break;
													}
						}
		}
		for (i = 0;i < n;i++)
		{
						System.out.printf("%d\n",(*(p2 + i)));
		}

		return 0;
	}
}

