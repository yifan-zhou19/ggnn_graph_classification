public class huanzhe
{
	public String id = new String(new char[11]);
public int age;
}

package <missing>;

public class GlobalMembers
{
	public static huanzhe[] sick = tangible.Arrays.initializeWithDefaulthuanzheInstances(110);
	public static int panduan(tangible.RefObject<Integer> p1, tangible.RefObject<Integer> p2, int a, int b)
	{
		int jieguo = 0;
		if (a >= 60)
		{
			*(p1.argValue + p1.argValue) = b;
			*(p2.argValue + p1.argValue) = a;
			p1.argValue++;
			jieguo = 1;
		}
		return (jieguo);
	}
	public static void paixu(tangible.RefObject<Integer> p3, tangible.RefObject<Integer> p4, int c)
	{
		int j;
		int k;
		int temp;
		for (j = 0;j < c;j++)
		{
			for (k = 1;k < c - 1;k++)
			{
				if (*(p4.argValue + k) < *(p4.argValue + k + 1))
				{
					bian(p3.argValue);
					bian(p4.argValue);
				}
			}
		}

	}
	public static void Main(String[] args)
	{
		int n;
		int i;
		int pan;
		int[] ji = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] zhangzhe = new int[110];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pointer1,*pointer2;
		int pointer1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pointer2;
		int pointer2;
		pointer1 = ji;
		pointer2 = zhangzhe;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sick[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sick[i].age = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
		tangible.RefObject<Integer> tempRef_pointer1 = new tangible.RefObject<Integer>(pointer1);
		tangible.RefObject<Integer> tempRef_pointer2 = new tangible.RefObject<Integer>(pointer2);
			pan = panduan(tempRef_pointer1, tempRef_pointer2, sick[i].age, i);
			pointer2 = tempRef_pointer2.argValue;
			pointer1 = tempRef_pointer1.argValue;
			if (pan != 0)
			{
				sick[i].age = 0;
			}
		}
	tangible.RefObject<Integer> tempRef_pointer12 = new tangible.RefObject<Integer>(pointer1);
	tangible.RefObject<Integer> tempRef_pointer22 = new tangible.RefObject<Integer>(pointer2);
		paixu(tempRef_pointer12, tempRef_pointer22, ji[0]);
		pointer2 = tempRef_pointer22.argValue;
		pointer1 = tempRef_pointer12.argValue;
		for (i = 1;i < ji[0];i++)
		{
			System.out.printf("%s\n",sick[ji[i]].id);
		}
		for (i = 0;i < n;i++)
		{
			if (sick[i].age == 0)
			{
				continue;
			}
			System.out.printf("%s\n",sick[i].id);
		}
	}
}

