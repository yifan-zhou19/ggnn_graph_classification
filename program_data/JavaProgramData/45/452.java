package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pb;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pa;
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int i;
		int j;
		int k = 0;
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
		 i = a.length();
		 j = b.length();
		pa = a;
		 for (pb = b;pb < b.Substring(j);pb++)
		 {
			k++;
			if (*pa != *pb)
			{
				continue;
			}
			else
			{
				pa++;
			}
			if (*pa == a.charAt(i))
			{
				break;
			}
		 }
			System.out.printf("%d",k - i);
	}

}

