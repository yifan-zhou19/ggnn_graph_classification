package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int n;
	  int m;
	  int k = 0;
	  int i;
	  int j;
	  int[] a;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  a = (int)(malloc(n * (Integer.SIZE / Byte.SIZE)));
	  for (i = 0;i < n;i++)
	  {
	   for (j = 0;j < n;j++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a[j] = Integer.parseInt(tempVar2);
	   }
	   }
	   for (j = 0;j < n;j++)
	   {
		  if (a[j] == 0)
		  {
		  break;
		  }
	   }
	   for (m = j + 1;m < n;m++)
	   {
			 if (a[m] == 0)
			 {
			  k = k + m - j - 1;
		  break;
			 }
	   }
	  }
	   System.out.printf("%d",k);
	}
}

