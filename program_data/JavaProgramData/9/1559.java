public class patient
{
	public String id = new String(new char[10]);
	public int age;
	public patient next;
	public patient last;
}

package <missing>;

public class GlobalMembers
{
	public static String temp = new String(new char[10]);
	public static int Main()
	{
		patient p1;
		patient p2;
		patient head;
		patient[] p = tangible.Arrays.initializeWithDefaultpatientInstances(N);
		int n;
		int i;
		int j;
		int tmp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		memset(p,0,sizeof(p));
		head = p + 1;
		for (i = 1;i <= n;i++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 p[i].id = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 p[i].age = Integer.parseInt(tempVar3);
		 }
		 p[i].last = p + i - 1;
		 p[i].next = p + i + 1;
		}
		head.last = null;
		p[i].next = null;
		for (i = n;i > 1;i--)
		{
			for (j = 1;j < n;j++)
			{
				if ((p + j + 1).age >= 60 && (p + j + 1).age > (p + j).age)
				{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
					memcpy(temp,(p + j).id,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
					memcpy((p + j).id,(p + j + 1).id,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
					memcpy((p + j + 1).id,temp,(Character.SIZE / Byte.SIZE));
					tmp = (p + j).age;
					(p + j).age = (p + j + 1).age;
					(p + j + 1).age = tmp;
				}
			}
		}
		for (;head != null;head = head.next)
		{
		System.out.printf("%s\n",head.id);
		}

	}
}

