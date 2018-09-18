package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	   int[] a = new int[1000];
	   int n;
	   int[] b = new int[15];
	   int m;
	   int i;
	   int j;
	   int z;
	   int num = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	   memset(a,0,1000 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	   memset(b,0,15 * (Integer.SIZE / Byte.SIZE));
	 while (true)
	 {
				 i = 0;
	 do
	 {

	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 if (m == 0)
	 {
	  break;
	 }
	  if (m == -1)
	  {
	  break;
	  }
	 b[i] = m;
	 i++;

	 }while (1 != 0);
	 if (m == -1)
	 {
	 break;
	 }

	 for (j = 0;j < i;j++)
	 {
	  for (z = 0;z < i;z++)
	  {
	   if (b[j] * 2 == b[z])
	   {
		a[num]++;
	   }
	  }
	 }
	 num++;


	 }
	 for (j = 0;j < num;j++)
	 {
	  System.out.printf("%d\n",a[j]);
	 }

	}
}

