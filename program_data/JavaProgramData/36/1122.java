package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String b = new String(new char[200]);
	 String a = new String(new char[200]);
	 int[] acal = new int[26];
	 int[] bcal = new int[26];
	  int alen;
	  int blen;
	  int i = 0;
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
	 alen = a.length();
	 blen = b.length();
	 if (alen != blen)
	 {
		 System.out.print("NO");
	 }
	 else
	 {
		  for (i = 0;i <= alen - 1;i++)
		  {
			acal[a.charAt(i) - 97]++;
		  }
		for (i = 0;i <= blen - 1;i++)
		{
			bcal[b.charAt(i) - 97]++;
		}
		for (i = 0;i <= 25;i++)
		{
			if (acal[i] != bcal[i])
			{
		  break;
			}
		}
		if (i == 26)
		{
		System.out.print("YES");
		}
		else
		{
		System.out.print("NO");
		}
	 }

	 System.in.read();
	 System.in.read();
	}
}

