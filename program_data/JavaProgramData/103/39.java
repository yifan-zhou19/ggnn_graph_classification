package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[1000];
		  int[] b = new int[1000];
		  int l;
		  int i;
		  int p = 0;
		  String zm = new String(new char[1000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  zm = tempVar.charAt(0);
		  }
		  l = zm.length();
		  b[0] = zm.charAt(0);
		  for (i = 1;i < l;i++)
		  {
						  if (zm.charAt(i) == zm.charAt(i - 1) || zm.charAt(i) == zm.charAt(i - 1) - 'a'+'A' || zm.charAt(i) == zm.charAt(i - 1) - 'A'+'a')
						  {
						  a[p] = a[p] + 1;
						  }
						  else
						  {
							  p = p + 1;
							  b[p] = zm.charAt(i);
						  }
		  }
		  for (i = 0;i <= p;i++)
		  {
						   if (b[i] <= 'z' && b[i] >= 'a')
						   {
						   b[i] = b[i] - 'a'+'A';
						   }
		  }
		  for (i = 0;i <= p;i++)
		  {
						   System.out.printf("(%c,%d)",b[i],a[i] + 1);
		  }
	}
}

