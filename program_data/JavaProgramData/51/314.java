package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int[] c = new int[500];
	  int i;
	  int j;
	  int k = 0;
	  int n;
	  final String a = "";
	  final String b = "";
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  System.in.read();
	  a = new Scanner(System.in).nextLine();
	  for (i = 0;a.charAt(i + n - 1) != '\0';i++)
	  {
		   for (j = 0;j < n;j++)
		   {
		   b.charAt(i)[j] = a.charAt(i + j);
		   }
	  }
	  for (i = 0;a.charAt(i + n - 1) != '\0';i++)
	  {
		   for (j = i;a.charAt(j + n - 1) != '\0';j++)
		   {
				 if (strcmp(b.charAt(i),b.charAt(j)) == 0)
				 {
				 c[i]++;
				 }
		   }
	  }
	  for (i = 0;c[i] > 0;i++)
	  {
		  if (c[i] > k)
		  {
		  k = c[i];
		  }
	  }
	  if (k == 1)
	  {
	  System.out.print("NO");
	  }
	  else
	  {
	  System.out.printf("%d\n",k);
	  for (i = 0;a.charAt(i + n - 1) != '\0';i++)
	  {
		   if (c[i] == k)
		   {
		   System.out.printf("%s\n",b.charAt(i));
		   }
	  }
	  }
	}

}

