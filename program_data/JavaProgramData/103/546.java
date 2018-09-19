package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int i;
		int k = 0;
		int m;
		 String s = new String(new char[1000]);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 s = tempVar.charAt(0);
		 }
		 if (s.charAt(0) > 96)
		 {
			 i = s.charAt(0) - 96;
		 }
		 else
		 {
			 i = s.charAt(0) - 64;
		 }
		 for (j = 0;s.charAt(j) != '\0';j++)
		 {
			 if (s.charAt(j) > 96)
			 {
			 m = s.charAt(j) - 96;
			 }
			 else
			 {
			 m = s.charAt(j) - 64;
			 }
			 if (m == i)
			 {
				 k++;
			 }
			 else
			 {
				 System.out.printf("(%c,%d)",i + 64,k);
				 i = m;
				 k = 1;
			 }
		 }
		 System.out.printf("(%c,%d)",i + 64,k);
		return 0;
	}

}

