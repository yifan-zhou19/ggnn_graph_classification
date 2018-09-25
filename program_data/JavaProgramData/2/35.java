public class data
{
 public int no;
 public String au = new String(new char[10]);
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 data[] lib = tangible.Arrays.initializeWithDefaultdataInstances(1000);
	 char x;
	 int n;
	 int i;
	 int j;
	 int[] num = new int[26];
	 int[] l = new int[1000];
	 int k;
	 int max;
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
		  lib[i].no = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  lib[i].au = tempVar3.charAt(0);
	  }
	  l[i] = String.valueOf(lib[i].au).length();
	 }
	 for (i = 0;i < n;i++)
	 {
	  for (j = 0;j < l[i];j++)
	  {
	   num[lib[i].au.charAt(j) - 65] = num[lib[i].au.charAt(j) - 65] + 1;
	  }
	 }
	 max = num[0];
	 for (i = 0;i < 26;i++)
	 {
	  if (num[i] > max)
	  {
	   max = num[i];
	   k = i;
	  }
	 }
	 System.out.printf("%c\n",k + 65);
	 System.out.printf("%d\n",max);
	 x = k + 65;
	 for (i = 0;i < n;i++)
	 {
	  for (j = 0;j < l[i];j++)
	  {
	   if (lib[i].au.charAt(j) == x)
	   {
	   System.out.printf("%d\n",lib[i].no);
	   }
	  }
	 }
	}
}

