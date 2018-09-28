package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int[] n = new int[100];
	  int[] m = new int[100];
	  int l = 0;
	  int s = 0;
	  int j = 0;
	  int i = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n[0] = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  m[0] = Integer.parseInt(tempVar2);
	  }
	  while (n[l] != 0)
	  {
		  l++;
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  n[l] = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  m[l] = Integer.parseInt(tempVar4);
		  }
	  }
	  for (j = 0;j <= l - 1;j++)
	  {
		  s = 0;
			for (i = 2; i <= n[j]; i++)
			{
				s = (s + m[j]) % i;
			}
			System.out.printf("%d\n", s + 1);

	  }


	}
}

