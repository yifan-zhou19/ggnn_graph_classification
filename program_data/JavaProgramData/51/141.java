package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int len;
	 String str = new String(new char[501]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 char * p2;
	 char[][] word = new char[510][5];
	 int[] num = new int[510];

	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 str = tempVar2.charAt(0);
	 }
	 p1 = p2 = str;
	 len = str.length();
	 for (i = 0;i < len - n + 1;i++)
	 {
		 p2 = p1;
		 for (j = 0;j < n;j++)
		 {
			 word[i][j] = p2;
			 p2++;
		 }
		 p1++;
	 } //??????????
	 for (i = 0;i < len - n + 1;i++)
	 {
		 num[i] = 1;
		 word[i][n] = '\0';
	 }
	 for (i = 0;i < len - n;i++)
	 {
		 for (j = i + 1;j < len - n + 1;j++)
		 {
			 if (strcmp(word[i],word[j]) == 0)
			 {
				 num[i]++;
			 }
		 }
	 }
	 int max = num[0];
	 for (i = 1;i < len - n + 1;i++)
	 {
		 if (max < num[i])
		 {
			 max = num[i];
		 }
	 }
	 if (max <= 1)
	 {
		 System.out.print("NO");
	 }
	 else
	 {
		System.out.printf("%d",max);
		for (i = 0;i < len - n + 1;i++)
		{
		 if (num[i] == max)
		 {
			 System.out.printf("\n%s",word[i]);
		 }
		}
	 }
	}

}

