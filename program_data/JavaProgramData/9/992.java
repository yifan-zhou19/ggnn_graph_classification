public class person
{
	public String id = new String(new char[20]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int m = 0;
		int k = 0;
		int z;
		person t = new person();
		person s;
		person o;
		person age;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		s = (person)malloc(n * sizeof(person));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		o = (person)malloc(n * sizeof(person));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		age = (person)malloc(n * sizeof(person));
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(*(s + i)).id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(*(s + i)).age = tempVar3;
			}
			if ((*(s + i)).age >= 60)
			{
				*(o + k) = *(s + i);
				k++;
			}
			else
			{
				*(age + m) = *(s + i);
				m++;
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = k - 1;j > i;j--)
			{
				if ((*(o + j)).age > (*(o + j - 1)).age)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=*(o+j);
				t.copyFrom((o + j));
				*(o + j) = *(o + j - 1);
				*(o + j - 1) = t;
				}
			}
		 System.out.printf("%s\n",(*(o + i)).id);
		}
		for (i = 0;i < m;i++)
		{
		  System.out.printf("%s\n",(*(age + i)).id);
		}
	}
}

