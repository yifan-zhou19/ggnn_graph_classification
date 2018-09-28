public class person
{
 public String num = new String(new char[11]);
 public int yr;
}

package <missing>;

public class GlobalMembers
{
	public static person[] pe = tangible.Arrays.initializeWithDefaultpersonInstances(100);
	public static person t = new person();
	public static int Main()
	{
	 int n;
	 int i;
	 int e;
	 int k;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  pe[i].num = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  pe[i].yr = Integer.parseInt(tempVar3);
	  }
	 }
		for (k = 0 ; k < n ; k++)
		{
	 for (i = 0; i < n - k - 1 ; i++)
	 {
	   if ((pe[i + 1].yr >= 60) && (pe[i].yr < pe[i + 1].yr))
	   {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=pe[i];
		t.copyFrom(pe[i]);
		pe[i] = pe[i + 1];
		pe[i + 1] = t;
	   }
	 }
		}
		for (i = 0;i < n;i++)
		{
	  System.out.printf("%s\n",pe[i].num);
		}
	 return 0;
	}
}

