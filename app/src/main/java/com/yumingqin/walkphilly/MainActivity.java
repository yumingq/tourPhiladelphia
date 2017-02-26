package com.yumingqin.walkphilly;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MainActivity extends Activity {
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;
    static CharSequence location;
    ArrayList<Location> allLocs = new ArrayList<Location>();
    PriorityQueue<Location> pq = new PriorityQueue<Location>();
    ArrayList<Location> selectedLocs;
    public static ArrayList<Location> points = new ArrayList<>();
    public static Location l = new Location(39.9415, -75.1995, "current", "");

    private void setUpLocs(){
        points.add(l);
        allLocs.add(new Location(39.9532281, -75.1589546, "Reading Terminal Market", "The Reading Terminal Market, established in 1892 at 12th and Arch Streets, is the nation’s oldest continuously operating farmers’ market. Through its long and interesting history , it has seen times both good and bad, but has emerged in the 21st century as one of the greatest public markets in the country. When you visit the market, you can enjoy eating virtually every type of cuisine, from sublime soul food and exquisite Asian and Middle Eastern dishes to authentic Philly Cheesesteaks and traditional Pennsylvania Dutch fare — all available from largely family-run stands."));
        allLocs.add(new Location(39.949531,-75.149732, "Independence National Historic Park", "Known as the birthplace of American democracy, Historic Philadelphia’s Independence National Historical Park (INHP) is located on the site of many of the seminal events that carried the nation through its founding as a global leader of democratic ideals. The Liberty Bell Center, Independence Hall, Congress Hall, the New Hall Military Museum, Franklin Court, the Bishop White House and the Graff House are just some of the buildings that make up Independence National Historical Park — all of which are free."));
        allLocs.add(new Location(39.96557,-75.180966, "Philadelphia Museum of Art", "Like Philadelphia’s own Parthenon, the Philadelphia Museum of Art sits majestically on a rise at the end of the Benjamin Franklin Parkway. The vast collections of this temple of art make it the third-largest art museum in the country, and an absolute must-see on the city’s cultural circuit"));
        allLocs.add(new Location(39.94961,-75.150282, "Liberty Bell Center", "The Liberty Bell’s home on Independence Mall is as powerful and dramatic as the bell itself. Throughout the expansive, light-filled center, larger-than-life historic documents and graphic images explore the facts and the myths surrounding the bell."));
        allLocs.add(new Location(39.948874,-75.150023, "Independence Hall", "Independence Hall is the building where both the United States Declaration of Independence and the United States Constitution were debated and adopted. It is now the centerpiece of the Independence National Historical Park in Philadelphia, Pennsylvania"));
        allLocs.add(new Location(39.96493,-75.180047, "Rocky Steps", "As famous as the statue itself is, the stairs leading to the East Entrance of the Philadelphia Museum of Art, aka “The Rocky Steps,” may be even more famous. In fact, they’ve been declared the second most famous movie filming location in the entire world(!!).Making the iconic trip up the steps is regarded as a symbol of perseverance and determination — and a must-do on your visit to Philadelphia."));
        allLocs.add(new Location(39.953892,-75.149066, "National Constituion Center", "The National Constitution Center is the first and only institution in America established by Congress to “disseminate information about the United States Constitution on a non-partisan basis in order to increase the awareness and understanding of the Constitution among the American people.” The Constitution Center brings the United States Constitution to life by hosting interactive exhibits and constitutional conversations and inspires active citizenship by celebrating the American constitutional tradition."));
        allLocs.add(new Location(40.100145,-75.430196, "Valley Forge National Historic Park", "With more than 3,600 acres of rolling hills and well-worn trails, Valley Forge is now a magnet for runners, bicyclists and picnickers as well as history buffs. The vast expanse of open space links the Schuylkill River Trail to the Horse Shoe Trail, turning the park into a major hub in a 75-mile system linking Philadelphia to the Appalachian Trail."));
        allLocs.add(new Location(39.953853,-75.165294 , "LOVE Park", "A favorite destination for tourists and locals alike, John F. Kennedy Plaza gets its famed nickname “LOVE Park” due to its famous sculpture. Located near City Hall, LOVE Park serves as the grand entrance to the Benjamin Franklin Parkway. The plaza, designed by famed City Planner Edmond Bacon, father of actor Kevin Bacon, was originally constructed over an underground parking garage in 1965. The plaza expanded in 1969 with the addition of beautifully curved granite steps and a majestic fountain."));
        allLocs.add(new Location(39.955809,-75.150411, "Franklin Square", "Franklin Square, one of five public squares laid out by William Penn in his original plan for Philadelphia, offers a refreshing, urban green space with a ton of awesome activities within its eight-acre grounds. The park boasts several family-friendly attractions, including a miniature golf course, classic carousel, burger joint, storytelling bench, picnic area and more."));
        allLocs.add(new Location(39.958211,-75.173135, "Franklin Institute", "An innovator in designing hands-on exhibits before “interactive” became a buzzword, The Franklin Institute is as clever as its namesake. Its eminently touchable attractions explore science in disciplines ranging from sports to space. Highlights include The Sports Challenge, which uses virtual-reality technology to illustrate the physics of sports; The Train Factory’s climb-aboard steam engine; Space Command’s simulated earth-orbit research station; a fully equipped weather station; and exhibits on electricity."));
        allLocs.add(new Location(39.973911,-75.19481, "Philadelphia Zoo", "One of the best laid-out and most animal-packed zoos in the country, the Philadelphia Zoo is set among a charming 42-acre Victorian garden with tree-lined walks, formal shrubbery, ornate iron cages and animal sculptures. The zoo has garnered many “firsts” in addition to being the first zoo charted in the United States (1859), including the first orangutan and chimp births in a U.S. zoo (1928), the world’s first children’s zoo (1957) and the first U.S. exhibit of white lions (1993), among others"));
        allLocs.add(new Location(39.960643,-75.172807, "Barnes Foundation", "The 93,000-square-foot, two-story building, designed by architects Tod Williams and Billie Tsien, is described as a “gallery in a garden, a garden in a gallery.” With a textured grey-and-gold Ramon limestone exterior and a glass canopy that glows at night, the breathtaking building serves as one of the key anchors of the Parkway Museum District. But the true draw is the Barnes’ permanent collection, featuring 181 Renoirs, 69 Cézannes and 59 Matisses, along with works by Manet, Degas, Seurat, Prendergrast, Titian and Picasso — one of the world’s largest collections of Impressionist, Post-Impressionist and early Modern paintings and African sculpture."));
        allLocs.add(new Location(39.95247,-75.167847, "One Liberty Observation Deck", "One Liberty Observation Deck, which opened in November 2015, provides Philadelphia with panoramic bird’s-eye views of the city from the 57th floor of One Liberty Place in downtown Philadelphia."));
        allLocs.add(new Location(39.952302,-75.144746, "The Betsy Ross House", "Did she or didn’t she sew the first American flag? Ask Betsy Ross about her role in making the first national flag yourself when you visit the iconic home of America’s most famous flag maker. The home of the famous seamstress is a must-see historic attraction for visitors and locals alike. Wander through the tiny rooms and tight staircases of the 1740 residence that Betsy rented while establishing her living as an upholsterer."));
        allLocs.add(new Location(39.979487,-75.209012, "Please Touch Museum","Since 1976, Please Touch Museum has been the Children’s Museum of Philadelphia. Over three decades and more than two million visitors later, Please Touch Museum has grown into one of the nation’s premier children’s museums by becoming experts in play. The mission of the museum is to enrich the lives of children by creating learning opportunities through play, laying the foundation for a lifetime of hands-on learning and cultural awareness."));
        allLocs.add(new Location(39.955608,-75.163143, "Pennsylvania Academy of the Fine Arts", "A jewel nestled in the heart of Center City, the Pennsylvania Academy of the Fine Arts (PAFA) boasts a vast collection of American art and treasures by local and national luminaries such as Charles Willson Peale (founder of the Academy), Thomas Eakins (who taught here), and Violet Oakley. One of Gilbert Stuart’s portraits of George Washington is a special source of pride for locals, as are other well-known paintings by artists such as Winslow Homer, John Singer Sargent, Edward Hopper and Cecilia Beaux – to name just a few."));
        allLocs.add(new Location(39.95709,-75.171205, "Academy of Natural Sciences", "The discoveries that rocked the world then and now share four floors of exhibit space in this family-friendly museum that showcases the Academy’s remarkable collections. The fully constructed Tyrannosaurus rex, one of the largest meat-eating dinosaurs, towers over Dinosaur Hall, also home to fossils from the Hadrosaurus foulkii, discovered in New Jersey in 1856. You can climb inside a Tyrannosaurus rex skull, try on horns and claws, and dig for fossils."));
        allLocs.add(new Location(39.949239,-75.191367, "Penn Museum of Archaeology and Anthropology", "If you called its 15-ton Egyptian sphinx “one in a million,” you’d be right: it is just one in a collection of nearly a million objects at the Penn Museum (also known as the University of Pennsylvania Museum of Archaeology and Anthropology)—one of the world’s finest archaeological and anthropological museums. For more then 125 years, the Penn Museum has sponsored worldwide scientific expeditions which have yielded many of the artifacts on display including Sumerian cuneiform clay tablets (some of the world’s oldest writing), architectural elements from the 3,200-year-old palace of the pharaoh Merenptah, the 4,500-year-old jewelry of Queen Puabi’s from the Mesopotamian Royal Cemetery at Ur (in modern-day Iraq), towering ancient Maya stone monuments and evocative masks from West Africa."));
        allLocs.add(new Location(39.968336,-75.172665, "Eastern State Penitentiary", "astern State Penitentiary set the standard for penal reform, with its soaring, castle-like Gothic architecture and its founders’ Quaker-inspired belief that solitary confinement could reform criminals. The 11-acre prison even had central heat, running water and flush toilets before the White House! A Who’s Who of the underworld – bank robber Willie Sutton, who staged a breakout in 1945, and Al Capone, who furnished his cell with antiques, rugs and oil paintings – both served time here."));
        allLocs.add(new Location(39.949529,-75.146888, "Benjamin Franklin Museum", "Dedicated to the life, times and legacy of Philadelphia's famous founding father, the Benjamin Franklin Museum invites you to explore a variety of exhibitions. The world-class museum features personal artifacts, computer animations and hands-on displays exploring Franklin’s life as a private citizen and statesman. Visitors can learn about the various roles Franklin filled during his lifetime, including his work as a printer, a scientist, a diplomat and a founder of civic institutions. Individual rooms in the museum reflect different aspects of Franklin’s personality and character traits, as he was known to be strategic, rebellious, curious and full of wonder."));
        allLocs.add(new Location(39.950181,-75.148426, "National Museum of American Jewish History", "Rising five stories above Independence Mall in the heart of Historic Philadelphia, the National Museum of American Jewish History brings to life the 360-year history of Jews in America. Through the use of evocative objects, telling moments and state-of-the-art interactive technologies, the museum traces the stories of how Jewish immigrants became Jewish Americans and invites visitors of all backgrounds to share their own stories, too. The museum’s 100,000-square-foot, five-story building allows you to explore more than 1,200 artifacts and documents as well as 2,500 images taken from the museum’s own collection, 30 original films and 13 state-of-the-art interactive media displays."));
        allLocs.add(new Location(39.950849,-75.150161, "Independence Visitor Center", "Located on Independence Mall at 6th and Market streets, the Independence Visitor Center is the perfect place to begin your visit to the Philadelphia region. The Visitor Center is just a stone’s throw from some of Philadelphia’s most popular attractions, including the Liberty Bell Center, Independence Hall, the National Museum of American Jewish History and the National Constitution Center."));
        allLocs.add(new Location(39.953311,-75.176639, "Mutter Museum", "The Mütter Museum is a riveting storehouse for the anatomically strange. The Museum’s display of 20,000 provocative items is designed to give a beneath-the-surface perspective of what physicians study. Inside the Museum, you’ll find a wide smattering of abnormal body parts preserved in fluid. You’ll encounter skeletal formations — like that of a 7’6” man — that don’t seem quite possible. Diseased and enlarged organs are tastefully displayed within glass-encased oak frames"));
        allLocs.add(new Location(39.952195,-75.180653, "Schuylkill Banks", "The Schuylkill Banks Boardwalk is a breathtaking, 2,000-foot-long pathway that extends the Schuylkill River Trail from Locust to South Street. The scenic path allows pedestrians, runners and bicyclists to literally walk over river to some of the best skyline views around. The pathway connects to the South Street Bridge via a 460-foot-long ramp that provides pedestrian, bicycle and ADA-compliant access to the Schuylkill River Trail. The over-the-water path is 15-feet wide and includes four scenic overlooks for those who want to relax and take in spectacular waterfront views of the Philadelphia Skyline."));
        allLocs.add(new Location(39.952767,-75.142397, "Elfreth's Alley", "Butchers. Bakers. Candlestick-makers. Named for blacksmith and property-owner Jeremiah Elfreth, Elfreth’s Alley was home to the 18th-century artisans and trades-people who were the backbone of colonial Philadelphia. Over 300 years later, the houses on this itty-bitty, cobblestone street are still hot properties."));
        allLocs.add(new Location(39.953304,-75.151765, "African American Museum of Philadelphia", "The African American Museum in Philadelphia, founded in 1976, is the first institution built by a major U.S. city to preserve, interpret and exhibit the heritage and culture of African-Americans. The museum takes a fresh and bold look at the stories of African-Americans and their role in the founding of the nation through the core permanent exhibit Audacious Freedom: African Americans in Philadelphia 1776 – 1876, allowing Octavius Cato, Richard Allen and other trailblazers to tell their stories via technology, photographs, videos and artifacts on display."));
        allLocs.add(new Location(39.950261,-75.151843, "Philadelphia History Museum", "Experience the city’s past at the renovated Philadelphia History Museum. The historic 1826 building, located just around the corner from Independence Hall and the Liberty Bell, has been an exciting gateway into Philadelphia history for nearly 70 years. Guests can enjoy handsomely designed galleries and encounter over 400 objects from the museum’s vast collection of over 100,000 pieces of history."));
        allLocs.add(new Location(39.963741,-75.132385, "SugarHouse Casino", "SugarHouse Casino, the first casino in the city of Philadelphia, is conveniently located on the picturesque Delaware River waterfront Located in Philly’s lively Fishtown neighborhood, SugarHouse Casino took over the site of the former Jack Frost Sugar Refinery. The casino’s property extends right up to the Delaware River and offers public green space and scenic pathways for running and biking. The casino is just a short distance from many of Philadelphia’s historic attractions, including the Liberty Bell and Independence Hall."));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpLocs();

        spinner = (Spinner) findViewById(R.id.spinner);
        adapter = ArrayAdapter.createFromResource(this, R.array.locations, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                location = (CharSequence) parent.getItemAtPosition(position);
                int numLocs = Integer.parseInt((String) location);
                selectedLocs = new ArrayList<Location>();
                System.out.println(numLocs);

                for(Location loc : allLocs){
                    //39.9415, -75.1995
                    loc.setDistance(Math.sqrt(Math.pow((39.9415 - loc.getLat()),
                            2) + Math.pow((-75.1995 - loc.getLongit()), 2)));
                    pq.add(loc);
                }

                int i = 0;
                while(i != numLocs){
                    Location temp = pq.peek();
                    System.out.println(temp.getName() + "\t" + temp.getDistance());
                    selectedLocs.add(pq.remove());
                    i++;
                }

                System.out.println("SIZE: "+ selectedLocs.size());
                for (Location one: selectedLocs) {
                    points.add(one);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

//        MapsActivity.setUpMapIfNeeded();
    }

    public void onLaunchButtonClick(View view){
        Intent i = new Intent(this, MapsActivity.class);
        startActivity(i);
    }
}
