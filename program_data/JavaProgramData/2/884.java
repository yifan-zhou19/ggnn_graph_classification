public class book
{
	public int num;
	public String name = new String(new char[1000]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static book head;
	public static int[] abc = new int[26];

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'name', so pointers on this parameter are left unchanged:
	public static void ffind(char * name)
	{
		while (*name != 0)
		{
			abc[*name-65]++;
			name = name.Substring(1);
		}


	}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'name', so pointers on this parameter are left unchanged:
	public static int mfind(char * name, char a)
	{
			while (*name != 0)
			{
			if (a == *name)
			{
				return 1;
			}
			name = name.Substring(1);
			}

	}

	public static book creat(int max)
	{
		int n;
		book p1;
		book p2;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (book)malloc(LEN);
		head = null;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			ffind(p1.name);
			n++;
			if (n == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
			p2.next = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (book)malloc(LEN);
		}while (n < max);
		p2.next = null;
		return head;
	}

	public static void Main()
	{
		int n;
		int i;
		int max = 0;
		int maxi = 0;
		String tt = new String(new char[2]);
		book p;
		book p1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = creat(n);
		p1 = p;

		for (i = 0;i < 26;i++)
		{
		if (abc[i] > max)
		{
			max = abc[i];
		maxi = i;
		}
		}

		System.out.printf("%C\n%d\n",65 + maxi,max);

		tt = tangible.StringFunctions.changeCharacter(tt, 0, maxi + 65);
		tt = tt.substring(0, 1);
		do
		{
			if (mfind(p1.name, maxi + 65) == 1)
			{
				max--;
				if (max != 0)
				{
				System.out.printf("%d\n",p1.num);
				}
				else
				{
					System.out.printf("%d",p1.num);
				}
			}
			p1 = p1.next;
		}while (p1 != 0);

	}
}

