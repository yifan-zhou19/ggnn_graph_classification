package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int[] c = new int[256];
		int[] d = new int[256];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 b = tempVar2.charAt(0);
	 }
	 int i;
	 int j;
	 int k;
	 for (i = 0;a.charAt(i) != '\0';i++)
	 {
		  j = a.charAt(i);
	   c[j] = c[j] + 1;
	 }
	 for (i = 0;b.charAt(i) != '\0';i++)
	 {
		  k = b.charAt(i);
	   d[k] = d[k] + 1;
	 }
	 for (i = 0;i < 256;i++)
	 {
	  if (c[i] != d[i])
	  {
		break;
	  }
	 }
	 if (i < 255)
	 {
	  System.out.print("NO");
	 }
	 else
	 {
	  System.out.print("YES");
	 }
	}
}

