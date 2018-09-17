public class Man
{
  public int sex;
  public float high;
}

package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
		return *((int)a) - (int)b;
	}
	public static Man[] man = tangible.Arrays.initializeWithDefaultManInstances(41);
	public static float[] male = new float[41];
	public static float[] female = new float[41];
	public static int Main()
	{
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int i;
	String str = new String(new char[10]);
	int j = 0;
	int k = 0;
	 for (i = 0;i < n;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 str = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 man[i].high = Float.parseFloat(tempVar3);
		 }

		 if (strcmp(str,"male") == 0)
		 {
			 man[i].sex = 0;
			 male[j++] = man[i].high;
		 }
		 else
		 {
			 man[i].sex = 1;
			 female[k++] = man[i].high;
		 }
	 }
	 qsort(male,j,(Float.SIZE / Byte.SIZE),cmp);
	 qsort(female,k,(Float.SIZE / Byte.SIZE),cmp);
	 for (i = 0;i < j;i++)
	 {
	  System.out.printf("%.2f ",male[i]);
	 }
	  for (i = k - 1;i > 0;i--)
	  {
	  System.out.printf("%.2f ",female[i]);
	  }
	   System.out.printf("%.2f",female[i]);
	  System.out.print("\n");
	return 0;
	}
}

