package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t;
		int i;
		int j;
		int k;
		int e;
		int sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *str=(char*)malloc(200 *sizeof(char));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char str = (String)malloc(200 * (Character.SIZE / Byte.SIZE));
		str = new Scanner(System.in).nextLine();
		t = Integer.parseInt(str);
		String[] p = new String[100];
		 for (i = 0;i < t;i++)
		 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p[i] = (String)malloc((Character.SIZE / Byte.SIZE) * 100001);
		 }
		 for (i = 0;i < t;i++)
		 {
			p[i] = new Scanner(System.in).nextLine();
		 }
		i = 0;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	for (;i < t;i++)
	{
			e = String.valueOf(p[i]).length();
			 for (j = 0;j < e;j++)
			 {
		 for (k = 0;k < e;k++)
		 {
			 if (*(p[i] + j) == *(p[i] + k) && j != k)
			 {
				 sum = 1;
			 }
		 }
			 if (sum == 0)
			 {
				 System.out.printf("%c\n",*(p[i] + j));
			 i++;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			 goto loop;
			 }
			 sum = 0;
			 }
		 System.out.print("no");
		 System.out.print("\n");
	}
	}
}
