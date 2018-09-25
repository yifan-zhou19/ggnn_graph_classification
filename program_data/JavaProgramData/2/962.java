package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int max = 0;
	int[] b = new int[1000];
	int[] p = new int[26];
	String[] bm = new String[1000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < 26;i++)
	{
	 p[i] = 0;
	}
	for (i = 0;i < n;i++)
	{
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 b[i] = Integer.parseInt(tempVar2);
	 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 bm[i] = (String)malloc(26 * (Character.SIZE / Byte.SIZE));
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 bm[i] = tempVar3.charAt(0);
	 }
	 for (j = 0;j < String.valueOf(bm[i]).length();j++)
	 {
	  p[(int)(*(bm[i] + j) - 'A')]++;
	 }
	}
	for (i = 0;i < 26;i++)
	{
	 if (p[i] > p[max])
	 {
	  max = i;
	 }
	}
	System.out.printf("%c\n",(char)('A' + max));
	System.out.printf("%d\n",p[max]);
	for (i = 0;i < n;i++)
	{
	 for (j = 0;j < String.valueOf(bm[i]).length();j++)
	 {
	   if (bm[i][j] == (char)('A' + max))
	   {
		System.out.printf("%d\n",b[i]);
		break;
	   }
	 }
	}
	return 1;
	}
}

