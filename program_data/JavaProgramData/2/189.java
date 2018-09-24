public class book
{
//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: unsigned int No;
	public int No;
	public String Name = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static char name;
	public static int num;
	public static int k = 0;
	public static int t = 0;
	public static int[] nametimes = new int[100];
	public static book p;
	public static void operate()
	{
		int i;
		for (i = 65;i < 91;i++)
		{
			if (nametimes[i] > t)
			{
				t = nametimes[i];
				name = i;
			}
		}
	}
	public static void print()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		book * pi = new book();
		int i;
		System.out.printf("%c\n%d\n",name,t);
		for (pi = p;pi < p + num;pi++)
		{
			for (i = 0;pi.Name.charAt(i) != '\0';i++)
			{
				if (pi.Name.charAt(i) == name)
				{
					if (k == 0)
					{
						System.out.printf("%d",pi.No);
						k++;
					}
					else
					{
						System.out.printf("\n%d",pi.No);
					}
					break;
				}
			}
		}
	}
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		book * pi = new book();
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		p = (book)malloc(num * sizeof(book));
		for (pi = p;pi < p + num;pi++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pi.No = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pi.Name = tempVar3.charAt(0);
			}
			for (i = 0;pi.Name.charAt(i) != '\0';i++)
			{
				nametimes[(int)pi.Name.charAt(i)]++;
			}
		}
		operate();
		print();
	}

}

