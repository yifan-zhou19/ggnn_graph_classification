package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int len;
		  String a = new String(new char[600]);
		  char c;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(null, 1);
		  if (tempVar2 != null)
		  {
			  c = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a = tempVar3.charAt(0);
		  }
		  len = a.length();
		  char[][] b =
		  {
			  {0, '\0', '\0', '\0', '\0'}
		  };
		  int[] outcome = new int[600];
		  for (i = 0;i <= len - n;i++)
		  {
							   for (j = 0;j <= n - 1;j++)
							   {
												  b[i][j] = a.charAt(i + j);
							   }
							   for (j = n;j <= 5;j++)
							   {
								   b[i][j] = 0;
							   }

		  } //??len-n+1?n-gram
		  for (i = 0;i <= len - n;i++)
		  {
							   outcome[i] = 1;
							   for (j = i + 1;j <= len - n;j++)
							   {
							   if (strcmp(b[i],b[j]) == 0)
							   {
								   outcome[i] += 1;
							   }
							   }
		  }
		  int max = 0;
		  for (i = 0;i <= len - n;i++)
		  {
		  if (outcome[i] > max)
		  {
			  max = outcome[i];
		  }
		  }
		  if (max == 1)
		  {
			  System.out.print("NO");
		  }
		  else
		  {
		  System.out.printf("%d\n",max);
		  for (i = 0;i <= len - n;i++)
		  {
							   if (outcome[i] == max)
							   {
								   System.out.printf("%s\n",b[i]);
							   }
		  }
		  }



	}

}

