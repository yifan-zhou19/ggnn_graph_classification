package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int max = 0;
		  int maxp;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[n];
		  int[] person = new int[26];
		  char[][] writer = new char[n][26];
		  for (i = 0;i < n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  writer[i] = tempVar3.charAt(0);
			  }
			  for (j = 0;j < String.valueOf(writer[i]).length();j++)
			  {
				  person[writer[i][j] - 'A']++;
			  }
		  }
		  for (i = 0;i < 26;i++)
		  {
			  if (max < person[i])
			  {
								max = person[i];
								maxp = i;
			  }
		  }
		  System.out.printf("%c\n%d\n",maxp + 'A',max);
		  for (i = 0;i < n;i++)
		  {
						  for (j = 0;j < String.valueOf(writer[i]).length();j++)
						  {
														  if (writer[i][j] == 'A' + maxp)
														  {
														  System.out.printf("%d\n",a[i]);
														  }
						  }
		  }
	}

}

