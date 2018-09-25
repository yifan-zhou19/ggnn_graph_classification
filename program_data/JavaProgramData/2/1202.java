package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct s
	//  {
	//	  int N;
	//   char w[26];
	//   };
	  s[] s = tangible.Arrays.initializeWithDefaultsInstances(999);
	  int n;
	  int i;
	  int j;
	  int c;
	  int[] a = new int[26];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i <= (n - 1);i++)
	  {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   s[i].N = tempVar2;
		   }
		 s[i].w = new Scanner(System.in).nextLine();
	  }
	  for (i = 0;i <= (n - 1);i++)
	  {
			 for (j = 0;j <= 25;j++)
			 {
				 c = s[i].w[j];
				a[c - 65]++;
			 }
	  }
	  c = 0;
	  for (i = 0;i <= 25;i++)
	  {
			if (a[c] < a[i])
			{
				c = i;
			}
	  }
	  System.out.printf("%c\n%d\n",c + 65,a[c]);
	  for (i = 0;i <= (n - 1);i++)
	  {
			for (j = 0;j <= 25;j++)
			{
			if (s[i].w[j] == (c + 65))
			{
				System.out.printf("%d\n",s[i].N);
			}
			}
	  }
	}
}

