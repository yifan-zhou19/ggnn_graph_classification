
import java.util.ArrayList;

/**
 * 
 * @author Cornita Nicusor-Razvan, 325 CB
 * 
 * 
 *
 */
public class Quadtree {
	public Node root;
	ArrayList<Integer> IDtemp = new ArrayList<Integer>();
	int ok = 0, x = 0;

	public Quadtree() {
	}

	/**
	 * Constructorul Quadtree creeaza radacina quadtree-ului si seteaza limitele
	 * radacinii
	 * 
	 * @param xmin
	 *            este limita inferioara a cadranului pe axa Ox
	 * @param ymin
	 *            este limita inferioara a cadranului pe axa Oy
	 * @param xmax
	 *            este limita superioara a cadranului pe axa Ox
	 * @param ymax
	 *            este limita superioara a cadranului pe axa Oy
	 */
	public Quadtree(float xmin, float ymin, float xmax, float ymax) {
		root = new Node();
		root.southBound = ymin;
		root.eastBound = xmax;
		root.northBound = ymax;
		root.westBound = xmin;
	}

	/**
	 * Metoda split creeaza 4 noduri copii (SW, SE, NE si NW) carora le seteaza
	 * limitele cadranului utilizant limitele cadranelor parintelui
	 * 
	 * @param n
	 *            este nodul curent
	 * @param nb
	 *            este limita de sus a parintelui
	 * @param eb
	 *            este limita din dreapta a parintelui
	 * @param sb
	 *            este limita de jos a parintelui
	 * @param wb
	 *            este limita din stanga a parinteului
	 */
	public void split(Node n, float nb, float eb, float sb, float wb) {
		n.SW = new Node();
		n.SE = new Node();
		n.NE = new Node();
		n.NW = new Node();

		n.SW.northBound = nb - ((nb - sb) / 2);
		n.SW.southBound = sb;
		n.SW.eastBound = eb - ((eb - wb) / 2);
		n.SW.westBound = wb;
		n.SE.northBound = nb - ((nb - sb) / 2);
		n.SE.southBound = sb;
		n.SE.eastBound = eb;
		n.SE.westBound = eb - ((eb - wb) / 2);
		n.NE.northBound = nb;
		n.NE.southBound = nb - ((nb - sb) / 2);
		n.NE.eastBound = eb;
		n.NE.westBound = eb - ((eb - wb) / 2);
		n.NW.northBound = nb;
		n.NW.southBound = nb - ((nb - sb) / 2);
		n.NW.eastBound = eb - ((eb - wb) / 2);
		n.NW.westBound = wb;
	}

	/**
	 * 
	 * @author Cornita Nicusor-Razvan, 325CB
	 *
	 *         Clasa Node contine limitele nodului, 4 noduri copii si 5
	 *         ArrayList-uri cu ID, x1, y1, x2 si y2;
	 */
	public class Node {
		float northBound, eastBound, southBound, westBound;
		Node NW, NE, SE, SW;
		ArrayList<Integer> ID = new ArrayList<Integer>();
		ArrayList<Float> x1 = new ArrayList<Float>();
		ArrayList<Float> y1 = new ArrayList<Float>();
		ArrayList<Float> x2 = new ArrayList<Float>();
		ArrayList<Float> y2 = new ArrayList<Float>();
		int ok = 0;

		Node() {
		}
	}

	/**
	 * 
	 * Metoda add adauga recursiv dreptunghiul incadrator in toate cadranele
	 * corespunzatoare a quadtree-ului. Adaugarea se face in felul urmator: se
	 * cauta in arbore in ce cadran se incadreaza dreptunghiul pana se ajunge la
	 * o frunza. Cand se ajunge la o frunza, daca aceasta este goala, se adauga
	 * datele dreptunghiului (cele 4 coordonate si ID-ul) si se continua
	 * recursiv. Daca s-a ajuns la o frunza care nu este goala, se verifica
	 * pentru toate figurile din nodul respectiv daca se intersecteaza cu
	 * dreptunghiul ce trebuie introdus. Daca se intersecteaza, se adauga la
	 * sfarsitul listei cu ID-uri din nodul respectiv. Daca nu se intersecteaza,
	 * pentru toate formele din acel nod, se adauga ID-ul intr-un ArrayList
	 * auxiliar,se sterge ce era inainte in nod, se creeaza 4 copii, se adauga
	 * figurile care erau inainte in nod si dupa se adauga figura ce trebuia
	 * adaugata initial.
	 * 
	 * @param h
	 *            este nodul curent
	 * @param x1
	 *            este limita inferioara a dreptunghiului incadrator pe axa Ox
	 * @param y1
	 *            este limita inferioara a dreptunghiului incadrator pe axa Oy
	 * @param x2
	 *            este limita superioara a dreptunghiului incadrator pe axa Ox
	 * @param y2
	 *            este limita superioara a dreptunghiului incadrator pe axa Oy
	 * @param ID
	 *            este ID ul figurii ce trebuie introdusa
	 * @return se intoarce in nodul parinte al nodului in care eram
	 */
	public Node add(Node h, float x1, float y1, float x2, float y2, int ID) {
		if (h.SW == null && h.NE == null && h.SE == null && h.NW == null) {
			if (h.ID.isEmpty()) {
				h.x1.add(x1);
				h.y1.add(y1);
				h.x2.add(x2);
				h.y2.add(y2);
				h.ID.add(ID);
			} else {
				for (int j = 0; j < h.ID.size(); j++) {
					if (!(h.x1.get(j) > x2 || h.y1.get(j) > y2 || x1 > h.x2.get(j) || y1 > h.y2.get(j))) {
						h.ID.add(ID);
						h.x1.add(x1);
						h.y1.add(y1);
						h.x2.add(x2);
						h.y2.add(y2);
						return h;
					}
				}
				for (int w = h.ID.size() - 1; w >= 0; w--) {
					IDtemp.add(h.ID.get(w));
					float a = h.x1.get(w), b = h.y1.get(w), c = h.x2.get(w), d = h.y2.get(w);
					int e = h.ID.get(w);
					h.ID.remove(w);
					h.x1.remove(w);
					h.y1.remove(w);
					h.x2.remove(w);
					h.y2.remove(w);

					if (h.SW == null && h.NE == null && h.SE == null && h.NW == null)
						split(h, h.northBound, h.eastBound, h.southBound, h.westBound);
					add(h, a, b, c, d, e);
				}
				IDtemp.clear();
				add(h, x1, y1, x2, y2, ID);
				return h;
			}
		}

		if (h.SW != null && (x1 <= h.SW.eastBound && y1 <= h.SW.northBound))
			h.SW = add(h.SW, x1, y1, x2, y2, ID);
		if (h.SE != null && (x2 > h.SE.westBound && y1 <= h.SE.northBound))
			h.SE = add(h.SE, x1, y1, x2, y2, ID);
		if (h.NE != null && (x2 >= h.NE.westBound && y2 >= h.NE.southBound))
			h.NE = add(h.NE, x1, y1, x2, y2, ID);
		if (h.NW != null && (x1 <= h.NW.eastBound && y2 >= h.NW.southBound))
			h.NW = add(h.NW, x1, y1, x2, y2, ID);

		return h;
	}

	/**
	 * Metoda remove cauta recursiv in arbore toate cadranele in care se gaseste
	 * figura cu ID-ul ce trebuie sters, caz in care se sterge ID-ul.
	 * 
	 * @param h
	 *            este nodul curent
	 * @param x1
	 *            este limita inferioara a dreptunghiului incadrator pe axa Ox
	 * @param y1
	 *            este limita inferioara a dreptunghiului incadrator pe axa Oy
	 * @param x2
	 *            este limita superioara a dreptunghiului incadrator pe axa Ox
	 * @param y2
	 *            este limita superioara a dreptunghiului incadrator pe axa Oy
	 * @param ID
	 *            este ID-ul ce trebuie sters
	 * @return se intoarce in nodul parinte al nodului in care eram
	 */
	public Node remove(Node h, float x1, float y1, float x2, float y2, float ID) {

		if (h.SW == null && h.NE == null && h.SE == null && h.NW == null) {
			for (int w = 0; w < h.ID.size(); w++) {
				if (h.ID.get(w) == ID) {
					h.ID.remove(w);
					h.x1.remove(w);
					h.y1.remove(w);
					h.x2.remove(w);
					h.y2.remove(w);
					return h;
				}
			}
		}

		if (h.SW != null && (x1 <= h.SW.eastBound && y1 <= h.SW.northBound))
			h.SW = remove(h.SW, x1, y1, x2, y2, ID);
		if (h.SE != null && (x2 >= h.SE.westBound && y1 <= h.SE.northBound))
			h.SE = remove(h.SE, x1, y1, x2, y2, ID);
		if (h.NE != null && (x2 >= h.NE.westBound && y2 >= h.NE.southBound))
			h.NE = remove(h.NE, x1, y1, x2, y2, ID);
		if (h.NW != null && (x1 <= h.NW.eastBound && y2 >= h.NW.southBound))
			h.NW = remove(h.NW, x1, y1, x2, y2, ID);

		return h;
	}

	/**
	 * 
	 * Metoda coliziunepunct parcurge arborele recursiv pana ajunge in frunza
	 * corespunzatoare, caz in care, pentru fiegare figura din acel nod, se
	 * testeaza daca punctul este in interiorul sau pe laturile figurii in felul
	 * urmator: pentru dreptunghi se verifica daca e in interior, pentru
	 * triunghi se creeaza 3 triunghiuri in interiorul triunghiului mare pentru
	 * care se afla ariile si daca suma acestora este egala cu aria
	 * triunghiului, inseamna ca este in interior. Similar se face pentru cerc
	 * si romb.
	 * 
	 * @param h
	 *            este nodul curent
	 * @param x
	 *            este coordonata x al punctului cu care trebuie verificata
	 *            coliziunea
	 * @param y
	 *            este coordonata y al punctului cu care trebuie verificata
	 *            coliziunea
	 * @param rect
	 *            este vectorul de forme adaugate pana acum in Quadtree
	 * @param array
	 *            este vectorul ce retine toate figurile cu care se
	 *            intersecteaza punctul dat
	 * @return se intoarce la nodul parinte al nodului in care suntem
	 */
	public Node coliziunepunct(Node h, float x, float y, Rectangle[] rect, ArrayList<Integer> array) {
		int ok = 0;

		if (h.SW != null && h.SE != null && h.NE != null && h.NW != null) {
			if (x <= h.SW.eastBound && y <= h.SW.northBound && ok == 0) {
				coliziunepunct(h.SW, x, y, rect, array);
				ok = h.SW.ok;
			}
			if (x >= h.SE.westBound && y <= h.SE.northBound && ok == 0) {
				coliziunepunct(h.SE, x, y, rect, array);
				ok = h.SE.ok;
			}
			if (x >= h.NE.westBound && y >= h.NE.southBound && ok == 0) {
				coliziunepunct(h.NE, x, y, rect, array);
				ok = h.NE.ok;
			}
			if (x <= h.NW.eastBound && y >= h.NW.southBound && ok == 0) {
				coliziunepunct(h.NW, x, y, rect, array);
				ok = h.NW.ok;
			}
		}

		for (int q = 0; q < h.ID.size(); q++) {
			int k = h.ID.get(q);
			if (rect[k].ID == h.ID.get(q)) {

				if (rect[k].forma == 1) {
					if (x >= rect[k].x1 && x <= rect[k].x2 && y <= rect[k].y2 && y >= rect[k].y1) {
						if (!array.contains(rect[k].ID))
							array.add(rect[k].ID);
						h.ok++;
					}
				}

				if (rect[k].forma == 2) {
					double ABC = Math.abs(rect[k].x1 * (rect[k].y2 - rect[k].y3)
							+ rect[k].x2 * (rect[k].y3 - rect[k].y1) + rect[k].x3 * (rect[k].y1 - rect[k].y2));
					double ABP = Math.abs(rect[k].x1 * (rect[k].y2 - y) + rect[k].x2 * (y - rect[k].y1)
							+ x * (rect[k].y1 - rect[k].y2));
					double APC = Math.abs(rect[k].x1 * (y - rect[k].y3) + x * (rect[k].y3 - rect[k].y1)
							+ rect[k].x3 * (rect[k].y1 - y));
					double PBC = Math.abs(x * (rect[k].y2 - rect[k].y3) + rect[k].x2 * (rect[k].y3 - y)
							+ rect[k].x3 * (y - rect[k].y2));
					if (ABC == ABP + APC + PBC) {
						if (!array.contains(rect[k].ID))
							array.add(rect[k].ID);
						h.ok++;
					}
				}

				if (rect[k].forma == 3) {
					if (Math.pow((x - rect[k].x1), 2) + Math.pow((y - rect[k].y1), 2) <= Math.pow(rect[k].R, 2)) {
						if (!array.contains(rect[k].ID))
							array.add(rect[k].ID);
						h.ok++;
					}
				}

				if (rect[k].forma == 4) {
					double ABCD = Math.abs(((rect[k].x4 - rect[k].x2) * (rect[k].y3 - rect[k].y1)) / 2);
					double ABP = Math.abs(rect[k].x2 * (rect[k].y3 - y) + rect[k].x3 * (y - rect[k].y2)
							+ x * (rect[k].y2 - rect[k].y3)) / 2;
					double PBC = Math.abs(rect[k].x3 * (y - rect[k].y4) + x * (rect[k].y4 - rect[k].y3)
							+ rect[k].x4 * (rect[k].y3 - y)) / 2;
					double CPD = Math.abs(rect[k].x4 * (y - rect[k].y1) + x * (rect[k].y1 - rect[k].y4)
							+ rect[k].x1 * (rect[k].y4 - y)) / 2;
					double APD = Math.abs(rect[k].x2 * (y - rect[k].y1) + x * (rect[k].y1 - rect[k].y2)
							+ rect[k].x1 * (rect[k].y2 - y)) / 2;

					if (ABCD == ABP + PBC + CPD + APD) {
						if (!array.contains(rect[k].ID))
							array.add(rect[k].ID);
						h.ok++;
					}
				}
			}
		}
		return h;
	}

	/**
	 * Metoda coliziunefigura cauta recursiv toate cadranele in care figura
	 * cautata s-ar afla si pentru fiecare nod din interiorul nodurilor
	 * respective, se testeaza daca se intersecteaza cu figura respectiva.
	 * 
	 * @param h
	 *            este nodul curent
	 * @param x1
	 *            este limita inferioara a dreptunghiului incadrator pe axa Ox
	 * @param y1
	 *            este limita inferioara a dreptunghiului incadrator pe axa Oy
	 * @param x2
	 *            este limita superioara a dreptunghiului incadrator pe axa Ox
	 * @param y2
	 *            este limita superioara a dreptunghiului incadrator pe axa Oy
	 * @param array
	 *            este vectorul cu dreptunghiurile incadratoare figurilor
	 *            introduse
	 * @return se intoarce in nodul parinte al nodului in care eram
	 */
	public Node coliziunefigura(Node h, float x1, float y1, float x2, float y2, ArrayList<Integer> array) {

		if (h.SW == null && h.NE == null && h.SE == null && h.NW == null) {
			for (int w = 0; w < h.ID.size(); w++) {
				if (!(h.x1.get(w) > x2 || h.y1.get(w) > y2 || x1 > h.x2.get(w) || y1 > h.y2.get(w))) {
					if (!array.contains(h.ID.get(w)))
						array.add(h.ID.get(w));
				}
			}
		}

		if (h.SW != null && (x1 <= h.SW.eastBound && y1 <= h.SW.northBound))
			h.SW = coliziunefigura(h.SW, x1, y1, x2, y2, array);
		if (h.SE != null && (x2 >= h.SE.westBound && y1 <= h.SE.northBound))
			h.SE = coliziunefigura(h.SE, x1, y1, x2, y2, array);
		if (h.NE != null && (x2 >= h.NE.westBound && y2 >= h.NE.southBound))
			h.NE = coliziunefigura(h.NE, x1, y1, x2, y2, array);
		if (h.NW != null && (x1 <= h.NW.eastBound && y2 >= h.NW.southBound))
			h.NW = coliziunefigura(h.NW, x1, y1, x2, y2, array);
		return h;
	}
}
