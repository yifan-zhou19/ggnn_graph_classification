public class pa
{
	public String id = new String(new char[10]);
	public int age;
	public int o;
}

package <missing>;

public class GlobalMembers
{
	public static int num;
	public static int n = 0;
	public static pa p;

	public static int operate()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		pa * pi = new pa();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		pa * pj = new pa();
		int agem = 0;
		int om = 0;
		for (pi = p;pi < p + num;pi++)
		{
			if (pi.o == 0)
			{
				continue;
			}
			for (pj = p;pj < p + num;pj++)
			{
				if (pj.age < pi.age)
				{
					pi.o++;
				}
			}
			if (pi.o > om)
			{
				om = pi.o;
			}
		}
		return om;
	}
	public static void print(int om)
	{
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		pa * pi = new pa();
		for (k = om;k >= 0;k--)
		{
			for (pi = p;pi < p + num;pi++)
			{
				if (pi.o == k)
				{
					if (n == 0)
					{
						System.out.printf("%s",pi.id);
						n++;
					}
					else
					{
						System.out.printf("\n%s",pi.id);
					}
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
		pa * pi = new pa();
		int om;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		p = (pa)malloc(num * sizeof(pa));
		for (pi = p;pi < p + num;pi++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pi.id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pi.age = Integer.parseInt(tempVar3);
			}
			if (pi.age >= 60)
			{
				pi.o = 1;
			}
			else
			{
				pi.o = 0;
			}
		}
		om = operate();
		print(om);
	}
}

