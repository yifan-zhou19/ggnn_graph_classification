package <missing>;

public class GlobalMembers
{
	public static String num1 = new String(new char[MAX_LENGTH + 10]);
	public static String num2 = new String(new char[MAX_LENGTH + 10]);
	public static int[] an1 = new int[MAX_LENGTH + 10];
	public static int[] an2 = new int[MAX_LENGTH + 10];
	public static int Main()
	{
	 int i;
	 int j;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 num1 = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 num2 = tempVar2.charAt(0);
	 }

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	 memset(an1, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	 memset(an2, 0, (Integer.SIZE / Byte.SIZE));

	 //?num1???????????????an1??
	 int length1 = num1.length();
	 int length2 = num2.length();
	 j = 0;
	 for (i = length1 - 1;i >= 0; i--)
	 {
		an1[j++] = num1.charAt(i) - '0';
	 }
	 j = 0;
	 for (i = length2 - 1;i >= 0; i--)
	 {
		an2[j++] = num2.charAt(i) - '0';
	 }

	 //????
	 for (i = 0;i < MAX_LENGTH; i++)
	 {
		an1[i] += an2[i];
		if (an1[i] >= 10)
		{
		 an1[i] -= 10;
		 an1[i + 1]++;
		}
	 }

	 int flagStart = 0;
	 for (i = MAX_LENGTH;i >= 0; i--)
	 {
		if (flagStart != 0)
		{
		 System.out.printf("%d",an1[i]);
		}
		else if (an1[i])
		{
		 System.out.printf("%d",an1[i]);
		 flagStart = 1;
		}
	 }
	 //????0?????0
	 if (flagStart == 0)
	 {
		 System.out.print("0\n");
	 }

	 //??

	 return 0;
	}
}

