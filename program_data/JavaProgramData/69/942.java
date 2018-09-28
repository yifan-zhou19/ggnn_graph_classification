package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String str1 = new String(new char[405]);
		 String str2 = new String(new char[405]);
		 str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		 str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		 int x = str1.length();
		 int y = str2.length();
		 int maxlen = x > y != 0?x:y;
		 int[] ans1 = new int[405];
		 int[] ans2 = new int[405];
		 int i;
		 int j = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		 memset(ans1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		 memset(ans2,0,(Integer.SIZE / Byte.SIZE));
		 for (i = x - 1;i >= 0;i--)
		 {
		 ans1[j++] = str1.charAt(i) - '0';
		 }
		 j = 0;
		 for (i = y - 1;i >= 0;i--)
		 {
		 ans2[j++] = str2.charAt(i) - '0';
		 }
		 for (i = 0;i < maxlen;i++)
		 {
			 ans1[i] += ans2[i];
			 if (ans1[i] >= 10)
			 {
			 ans1[i] -= 10;
			 ans1[i + 1]++;
			 }
		 }
		 i = maxlen;
		 while (ans1[i] == 0)
		 {
			 i--;
		 }
		 if (i < 0)
		 {
		 System.out.print(0);
		 }
		 else
		 {
		 for (;i >= 0;i--)
		 {
		 System.out.print(ans1[i]);
		 }
		 }
		 return 0;
	}
}

