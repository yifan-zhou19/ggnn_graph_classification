public class record
{
	public int id;
}

public class YyxNode
{
	public record m_rec = new record();
	public YyxNode next;
}

public class YyxLink
{
	public int n;
	public YyxNode head;
	public YyxNode tail;
}

package <missing>;

public class GlobalMembers
{
	public static YyxLink CreateNewLink()
	{
		YyxLink newLn;
		YyxNode newNd;
		if (((newLn = new YyxLink()) == null) || ((newNd = new YyxNode()) == null))
		{
			System.out.print("Error: memory out! (1)");
			System.exit(-1);
		}

		newLn.n = 0;
		newLn.head = newNd;
		newNd.next = null;
		newLn.tail = newNd;

		return newLn;
	}

	public static YyxLink AddNode(YyxLink ln, record rec)
	{
		YyxNode newNd;
		if ((newNd = new YyxNode()) == null)
		{
			System.out.print("Error: memory out! (2)");
			System.exit(-1);
		}

//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: newNd->m_rec = *rec;
		newNd.m_rec.copyFrom(rec);
		newNd.next = null;

		ln.tail.next = newNd;
		ln.tail = newNd;
		ln.n++;

		return ln;
	}

	public static YyxLink ClearLink(YyxLink ln)
	{
		YyxNode delNd;
		YyxNode nextNd;
		delNd = ln.head.next;
		for (; delNd != null; delNd = nextNd)
		{
			nextNd = delNd.next;
			delNd = null;
		}

		ln.n = 0;
		ln.head.next = null;

		return ln;
	}

	public static void FreeLink(YyxLink ln)
	{
		ClearLink(ln);
		ln.head = null;
		ln = null;
	}

	public static int Main()
	{
		YyxLink[] total;
		int m;
		record rec = new record();
		String author = new String(new char[27]);
		int i;
		String pch;
		YyxNode nd;

		if ((total = tangible.Arrays.initializeWithDefaultYyxLinkInstances(26)) == null)
		{
			System.out.print("Error: memory out! (3)\n");
			System.exit(-1);
		}
		for (i = 0; i < 26; i++)
		{
			total[i] = CreateNewLink();
		}

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (; m > 0; m--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				rec.id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				author = tempVar3.charAt(0);
			}
			pch = author;
			for (; pch != '\0'; pch++)
			{
				AddNode(total[pch - 'A'], rec);
			}
		}

		m = 0;
		for (i = 1; i < 26; i++)
		{
			if (total[m].n < total[i].n)
			{
				m = i;
			}
		}
		System.out.printf("%c\n%d\n", m + 'A', total[m].n);
		nd = total[m].head.next;
		for (; nd != null; nd = nd.next)
		{
			System.out.printf("%d\n", nd.m_rec);
		}

		return 0;
	}
}

