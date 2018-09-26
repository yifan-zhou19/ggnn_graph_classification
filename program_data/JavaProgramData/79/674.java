package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[30];
		int[] m = new int[30];
		int[] a = new int[300];
	int s;
	int j;
	int i;
	int k;
	 for (i = 0;;i++)
	 {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n[i] = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  m[i] = Integer.parseInt(tempVar2);
	  }
	  if (n[i] == 0 && m[i] == 0)
	  {
		s = i; //??S?????
		break;
	  }
	 }
	  for (i = 0;i < s;i++) //????
	  {
		  k = 1;
		for (j = 1;j <= n[i];j++)
		{
			a[j] = j; //?????
		}
		for (;n[i] > 1;n[i]--) //??N-1???
		{
			   for (j = 1;j <= n[i];j++) //????????
			   {
				if ((m[i] - j + k - 1) % n[i] == 0)
				{
					k = j;

					for (;j < n[i];j++)
					{
					a[j] = a[j + 1];
					}
				}
			   }
		}
		 System.out.printf("%d\n",a[1]);
	  }
	}
}

