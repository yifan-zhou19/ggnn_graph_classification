package <missing>;

public class GlobalMembers
{
	public static int a;
	public static int b;
	public static int[] c = new int[20];
	public static int[] d = new int[20];
	public static int[] s = new int[20];
	public static int l;
	public static int i;
	public static int j;
	public static void shuru()
	{
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  b = Integer.parseInt(tempVar2);
	  }
	  for (i = 0;i < a;i++)
	  {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  c[i] = Integer.parseInt(tempVar3);
	  }
	  }
	  for (i = 0;i < b;i++)
	  {
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  d[i] = Integer.parseInt(tempVar4);
	  }
	  }

	}
	public static int shuchu(int[] s)
	{
	  for (i = 0;i < a + b - 1;i++)
	  {
	  System.out.printf("%d ",s[i]);
	  }
	  System.out.printf("%d",s[a + b - 1]);
	return 0;
	}
	public static int paixu(int[] f, int k)
	{

	 for (i = 1;i < k;i++)
	 {
	 for (j = 0;j < k - i;j++)
	 {
	   if (f[j] >= f[j + 1])
	   {
		   l = f[j];
	   f[j] = f[j + 1];
	   f[j + 1] = l;
	   }
	 }
	 }
	 return 0;
	}
	 public static int hebing(int[] c, int[] d)
	 {
		for (i = 0;i < a;i++)
		{
	   s[i] = c[i];
		}
	 for (i = a;i < b + a;i++)
	 {
	   s[i] = d[i - a];
	 }
	  return 0;
	 }
	   public static void Main()
	   {
	   shuru();
	   paixu(c, a);
		paixu(d, b);
	   hebing(c, d);
	   shuchu(s);
	   }

}

