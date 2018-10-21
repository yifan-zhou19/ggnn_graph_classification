package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		// FILE *flog = fopen("log.txt", "w"); 
		// for (int i = 0; i < 8; i++) printf("1234567890");
		// printf("\n");
		int n;
		int i;
		int[] l = new int[300];
		int line = 0;
		int f;
		char[][] word = new char[300][30];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  word[i] = tempVar2.charAt(0);
						  }
						  l[i] = String.valueOf(word[i]).length();
		}
		for (i = 1;i <= n;i++)
		{
							f = 0;
							// fprintf(flog, "WORD (%d) %s = %d, NEXT (%d) %s = %d, LINE = %d\n", i, word[i], l[i], i + 1, word[i + 1], l[i + 1], line);
							if (line + l[i] <= 80)
							{
								System.out.printf("%s", word[i]);
								line += l[i];
								// fprintf(flog, "L = %d\n", line + l[i + 1] + 1); 
								if (i != n && line + l[i + 1] + 1 <= 80)
								{
									System.out.print(" ");
									line += 1;
									f = 1;
								}
							}
								// fprintf(flog, "F = %d\n", f); 
							if (line > 80 || f == 0)
							{
								System.out.print("\n");
								line = 0;
							}


		}
		// while(1);
		return 0;
	}

}

