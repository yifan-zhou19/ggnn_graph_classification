package <missing>;

public class GlobalMembers
{
	public static int rearrange(String s1, String s2)
	{
	  int[] count1 = new int[128];
	  int[] count2 = new int[128];
	int len1;
	int temp;
	len1 = s1.length();
	temp = s2.length();
	if (len1 != temp)
	{
		return 0;
	}
	for (temp = 0; temp < len1; ++temp)
	{
		count1[s1[temp]]++;
		count2[s2[temp]]++;
	}
	for (temp = 0;temp < 128; ++temp)
	{
	if (count1[temp] != count2[temp])
	{
		return 0;
	}
	}
	return 1;
	}
	public static void Main()
	{
	  int n;
	  int j;
	  int k;
	  int l1;
	  int l2;
	  int o;
	  int i;
	  String a = new String(new char[51]);
	  String b = new String(new char[51]);

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  b = tempVar2.charAt(0);
	  }
	  if (rearrange(a, b) != 0)
	  {
		  System.out.print("YES");
	  }
	  else
	  {
		  System.out.print("NO");
	  }



	}

}

